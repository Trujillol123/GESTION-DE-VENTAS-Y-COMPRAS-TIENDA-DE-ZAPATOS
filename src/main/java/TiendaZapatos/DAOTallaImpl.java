
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOTalla;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.talla;

/**
 *
 * @author cland
 */
public class DAOTallaImpl  extends Database implements DAOTalla {

    @Override
    public List<talla> getallTallas() throws Exception {
        List<talla> lista = new ArrayList<>();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM talla;");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                talla talla = new talla(rs.getInt("id_talla"), rs.getString("numero_talla"));
                lista.add(talla);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            throw new Exception("Error al obtener las tallas : " + e.getMessage(), e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public int obtenerIdPorNumero(String numero_talla) throws Exception {
 
    int idTalla = -1;
    String sql = "SELECT id_talla FROM talla WHERE numero_talla = ?";

    try {
        this.Conectar(); 
        PreparedStatement stmt = this.conexion.prepareStatement(sql);
        stmt.setString(1, numero_talla);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            idTalla = rs.getInt("id_talla");
        }
        rs.close();
        stmt.close();
    } catch (SQLException e) {
        throw new SQLException("Error al obtener el ID por nombre: " + e.getMessage(), e);
    } finally {
        this.Cerrar();
    }
    return idTalla;
                

            }
}
    
    

