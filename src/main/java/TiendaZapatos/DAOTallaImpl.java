/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOProveedor;
import interfaces.DAOTalla;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.marca;
import models.talla;

/**
 *
 * @author cland
 */
public class DAOTallaImpl  extends Database implements DAOTalla {

    

    @Override
    public talla readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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
}
    
    

