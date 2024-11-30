package Model;

import DTO.AlmacenDTO;
import UConnection.SQLDataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.Vector;
public class AlmacenModel {
    public static Collection<AlmacenDTO> obtenerListaAlmacen() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = SQLDataBaseConnection.GetConnection();
            String sql = "SELECT AlmacenId, NomAlmacen\n" +
                            "FROM Almacen";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Vector<AlmacenDTO> net = new Vector<AlmacenDTO>();
            AlmacenDTO Almacen = null;
            while(rs.next()) {
                Almacen = new AlmacenDTO();
                Almacen.setAlmacen(rs.getInt("AlmacenId"));
                Almacen.setNomAlmacen(rs.getString("NomAlmacen"));
                net.add(Almacen);
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
