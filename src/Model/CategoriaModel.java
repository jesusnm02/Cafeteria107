package Model;

import DTO.CategoriaDTO;
import UConnection.SQLDataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Instant;
import java.util.Collection;
import java.util.Vector;
public class CategoriaModel {
    public static Collection<CategoriaDTO> obtenerCategoriasHelados() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = SQLDataBaseConnection.GetConnection();
            String sql = "SELECT CategoriaId, NomCategoria \n" +
                            "FROM Categoria WHERE CategoriaId LIKE 'H%'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            Vector<CategoriaDTO> net = new Vector<CategoriaDTO>();
            CategoriaDTO Categoria = null;
            while(rs.next()) {
                Categoria = new CategoriaDTO();
                Categoria.setCategoriaId(rs.getString("CategoriaId"));
                Categoria.setNomCategoria(rs.getString("NomCategoria"));
                net.add(Categoria);
            }
            return net;
        } catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            SQLDataBaseConnection.CerrarConnection(con, ps, rs);
        }
    }
    
    public static Collection<CategoriaDTO> obtenerCategoriasIngredientes() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = SQLDataBaseConnection.GetConnection();
            String sql = "SELECT CategoriaId, NomCategoria \n" +
                            "FROM Categoria WHERE CategoriaId LIKE 'I%'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            Vector<CategoriaDTO> net = new Vector<CategoriaDTO>();
            CategoriaDTO Categoria = null;
            while(rs.next()) {
                Categoria = new CategoriaDTO();
                Categoria.setCategoriaId(rs.getString("CategoriaId"));
                Categoria.setNomCategoria(rs.getString("NomCategoria"));
                net.add(Categoria);
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
