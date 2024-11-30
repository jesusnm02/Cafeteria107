package Model;

import UConnection.SQLDataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class IngredienteModel {
    public static Boolean guardarIngrediente(
        String NomIngrediente, 
        String DesIngrediente, 
        String CategoriaId
    ) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = SQLDataBaseConnection.GetConnection();
            String sql = "INSERT INTO Ingrediente (NomIngrediente, DesIngrediente, CategoriaId)\n" +
                            "VALUES (?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, NomIngrediente);
            ps.setString(2, DesIngrediente);
            ps.setString(3, CategoriaId);
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            SQLDataBaseConnection.CerrarConnection(con, ps, null);
        }
    }
    
    public static int obtenerUltimoIngredienteId() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = SQLDataBaseConnection.GetConnection();
            String sql = "SELECT last_used_value\n" +
                            "FROM sys.sequences\n" +
                            "WHERE name = 'IngredientIdGenerator';";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) { // Verifica si el ResultSet tiene una fila
                System.out.println(rs.getInt("last_used_value"));
                return rs.getInt("last_used_value"); // Cambié el nombre
            } else {
                System.out.println("No se encontró un valor para la secuencia 'HeladosIdGenerator'.");
                return 0; // Devuelve 0 si no hay resultado
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al obtener el último ID de helado.", e);
        } finally {
            SQLDataBaseConnection.CerrarConnection(con, ps, rs);
        }
    }
    
    public static Boolean guardarStock(
        int StockIngrediente,
        Float PrecioIngrediente,
        int IngredienteId,
        int AlmacenId
    ) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con =SQLDataBaseConnection.GetConnection();
            String sql = "INSERT INTO Almacen_Ingrediente (StockIngrediente, PrecioIngrediente, IngredienteId, AlmacenId)\n" +
                            "VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, StockIngrediente);
            ps.setFloat(2, PrecioIngrediente);
            ps.setInt(3, IngredienteId);
            ps.setInt(4, AlmacenId);
            
            int filaAfectadas = ps.executeUpdate();
            return filaAfectadas > 0;
        } catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            SQLDataBaseConnection.CerrarConnection(con, ps, null);
        }
    }
}
