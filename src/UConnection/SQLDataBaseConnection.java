package UConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQLDataBaseConnection {
    private static Connection con = null;

    public static Connection GetConnection() {
        String connectionUrl =
                "jdbc:sqlserver://localhost\\HOUSE:1433;" // Cambia localhost si tu servidor tiene otro nombre.
                        + "database=Cafe107;"       // Cambia Cafe107 por el nombre de tu base de datos.
                        + "user=User109;"      // Cambia yourUsername por tu usuario de SQL Server.
                        + "password=123456;"  // Cambia yourPassword por la contraseña del usuario.
                        + "encrypt=false;"           // Puedes usar "false" si no configuras certificados SSL.
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";
        try {
            con = DriverManager.getConnection(connectionUrl);
            System.out.println("Conexión establecida exitosamente.");
        } catch (SQLException e) {
            System.err.println("Error al conectarse a la base de datos:");
            e.printStackTrace();
        }
        return con;
    }
    
    public static void CerrarConnection(
        Connection con,
        PreparedStatement ps,
        ResultSet rs
    ) {
        try {
            if(rs != null) rs.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        try {
            if(ps != null) ps.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        try {
            if(con != null) con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}