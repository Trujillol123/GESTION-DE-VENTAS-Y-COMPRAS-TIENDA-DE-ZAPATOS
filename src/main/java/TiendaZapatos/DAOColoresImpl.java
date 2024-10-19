/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOColores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.colores;

/**
 *
 * @author cland
 */
public class DAOColoresImpl extends Database implements DAOColores {

        @Override
        public List<colores> getallColors() throws Exception {
     
            List<colores> lista = new ArrayList<>();
            try {
                this.Conectar();
                PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM colores;");
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    colores colores = new colores(rs.getInt("id_color"), rs.getString("nombre_color"));
                    lista.add(colores);
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
    public colores readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
