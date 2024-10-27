package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOCategoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.categoria;


public class DAOCategoriasImpl extends Database implements DAOCategoria{

    @Override
    public List<categoria> getallCategorias() throws Exception {
        List<categoria> lista = new ArrayList<>();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM categoria;");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                categoria categoria = new categoria(rs.getInt("id_categoria"), rs.getString("nombre_categoria"));
                lista.add(categoria);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            throw new Exception("Error al obtener la categoria: " + e.getMessage(), e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }    

    
    
}
