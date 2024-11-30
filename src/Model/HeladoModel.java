package Model;

import UConnection.SQLDataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class HeladoModel {
    public static Boolean guardarHelado(
        String NomHelados, 
        String DesHelados, 
        String CategoriaId
    ) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = SQLDataBaseConnection.GetConnection();
            String sql = "INSERT INTO Helados (NomHelados, DesHelados, CategoriaId)\n" +
                            "VALUES (?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, NomHelados);
            ps.setString(2, DesHelados);
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
    
    public static int obtenerUltimoHeladoId() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = SQLDataBaseConnection.GetConnection();
            String sql = "SELECT last_used_value " + // Cambié el nombre a last_value
                         "FROM sys.sequences " +
                         "WHERE name = 'HeladosIdGenerator';";
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
        int StockHelado,
        Float PrecioHelado,
        int HeladosId,
        int AlmacenId
    ) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con =SQLDataBaseConnection.GetConnection();
            String sql = "INSERT INTO Almacen_Helado (StockHelado, PrecioHelado, HeladosId, AlmacenId)\n" +
                            "VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, StockHelado);
            ps.setFloat(2, PrecioHelado);
            ps.setInt(3, HeladosId);
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
