package Model;

import DTO.HeladoAlmacenDTO;
import UConnection.SQLDataBaseConnection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.Vector;

public class HeladoAlmacenModel {
    public static Collection<HeladoAlmacenDTO> obtenerHeladosAlmacen() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = SQLDataBaseConnection.GetConnection();
            String sql = "SELECT A.AlmacenId, B.HeladosId, NomAlmacen, NomHelados, StockHelado, PrecioHelado, PrecioTotal, DesHelados\n" +
                            "FROM Almacen A INNER JOIN Almacen_Helado B ON A.AlmacenId = B.AlmacenId\n" +
                            "INNER JOIN Helados C ON B.HeladosId = C.HeladosId";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            Vector<HeladoAlmacenDTO> net = new Vector<HeladoAlmacenDTO>();
            HeladoAlmacenDTO Helado = null;
            while(rs.next()) {
                Helado = new HeladoAlmacenDTO();
                Helado.setAlmacenId(rs.getInt("AlmacenId"));
                Helado.setHeladosId(rs.getInt("HeladosId"));
                Helado.setNomAlmacen(rs.getString("NomAlmacen"));
                Helado.setNomHelados(rs.getString("NomHelados"));
                Helado.setStockHelado(rs.getInt("StockHelado"));
                Helado.setPrecioHelado(rs.getFloat("PrecioHelado"));
                Helado.setPrecioTotal(rs.getFloat("PrecioTotal"));
                Helado.setDesHelados(rs.getString("DesHelados"));
                net.add(Helado);
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
