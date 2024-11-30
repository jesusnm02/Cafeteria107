package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DTO.StockIngredienteDTO;
import UConnection.SQLDataBaseConnection;
import java.util.Collection;
import java.util.Vector;

public class StockIngredienteModel {
    public static Collection<StockIngredienteDTO> obtenerIngredientesInStock() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = SQLDataBaseConnection.GetConnection();
            String sql = "SELECT AlmacenIngredienteId ,StockIngrediente, PrecioIngrediente, IngredienteId\n" +
                            "FROM Almacen_Ingrediente";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Vector<StockIngredienteDTO> net = new Vector<StockIngredienteDTO>();
            StockIngredienteDTO StockIngrediente = null;
            while(rs.next()) {
                StockIngrediente = new StockIngredienteDTO();
                StockIngrediente.setAlmacenIngredienteId(rs.getInt("AlmacenIngredienteId"));
                StockIngrediente.setStockIngrediente(rs.getInt("StockIngrediente"));
                StockIngrediente.setPrecioIngrediente(rs.getFloat("PrecioIngrediente"));
                StockIngrediente.setIngredienteId(rs.getInt("IngredienteId"));
                net.add(StockIngrediente);
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
