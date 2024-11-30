package Model;
import DTO.IngredientesAlmacenDTO;
import UConnection.SQLDataBaseConnection;
import java.util.Collection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class IngredienteAlmacenModel {
    public static Collection<IngredientesAlmacenDTO> obtenerIngredienteAlmacen() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = SQLDataBaseConnection.GetConnection();
            String sql = "SELECT A.AlmacenId, B.IngredienteId, NomAlmacen, NomIngrediente, StockIngrediente, PrecioIngrediente, PrecioTotal, DesIngrediente\n" +
                            "FROM Almacen A INNER JOIN Almacen_Ingrediente B ON A.AlmacenId = B.AlmacenId\n" +
                            "INNER JOIN Ingrediente C ON B.IngredienteId = C.IngredienteId";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            Vector<IngredientesAlmacenDTO> ret = new Vector<IngredientesAlmacenDTO>();
            IngredientesAlmacenDTO Ingrediente = null;
            while(rs.next()) {
                Ingrediente = new IngredientesAlmacenDTO();
                Ingrediente.setAlmacenId(rs.getInt("AlmacenId"));
                Ingrediente.setIngredienteId(rs.getInt("IngredienteId"));
                Ingrediente.setNomAlmacen(rs.getString("NomAlmacen"));
                Ingrediente.setNomIngrediente(rs.getString("NomIngrediente"));
                Ingrediente.setStockIngrediente(rs.getInt("StockIngrediente"));
                Ingrediente.setPrecioIngrediente(rs.getFloat("PrecioIngrediente"));
                Ingrediente.setPreciototal(rs.getFloat("PrecioTotal"));
                Ingrediente.setDesIngrediente(rs.getString("DesIngrediente"));
                ret.add(Ingrediente);
            } 
            return ret;
        } catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }  finally {
            SQLDataBaseConnection.CerrarConnection(con, ps, rs);
        }
    }
}
