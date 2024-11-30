package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DTO.RecetaDTO;
import UConnection.SQLDataBaseConnection;
import java.util.Collection;
import java.util.Vector;

public class RecetaModel {
    public static Collection<RecetaDTO> obtenerRecetas() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = SQLDataBaseConnection.GetConnection();
            String sql = "SELECT A.HeladosId, A.NomHelados, B.Cantidad, B.IngredienteId\n" +
                            "FROM Helados A INNER JOIN Receta B\n" +
                            "ON A.HeladosId = B.HeladosId";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Vector<RecetaDTO> net = new Vector<RecetaDTO>();
            RecetaDTO Receta = null;
            while(rs.next()) {
                Receta = new RecetaDTO();
                Receta.setHeladosId(rs.getInt("HeladosId"));
                Receta.setNomHelados(rs.getString("NomHelados"));
                Receta.setCantidad(rs.getInt("Cantidad"));
                Receta.setIngredienteId(rs.getInt("IngredienteId"));
                net.add(Receta);
            }
            return net;
        } catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            SQLDataBaseConnection.CerrarConnection(con, ps, rs);
        }
    }
 }
