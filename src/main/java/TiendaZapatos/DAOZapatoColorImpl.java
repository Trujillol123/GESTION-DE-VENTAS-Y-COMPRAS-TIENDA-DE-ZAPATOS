/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOZapatoColor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import models.zapato_color;

/**
 *
 * @author cland
 */
public class DAOZapatoColorImpl  extends Database implements DAOZapatoColor {

    @Override
    public void create(zapato_color zapato_color) throws SQLException, Exception {
    try {
                this.Conectar();
                PreparedStatement st = this.conexion.prepareStatement(
                    "INSERT INTO zapatoColor ( id_color) VALUES (?)"
                );

                st.setInt(1, zapato_color.getId_color());

                st.executeUpdate();
            } catch (Exception e) {
                throw e;
            } finally {
                this.Cerrar();
            }
        }    

    @Override
    public List<zapato_color> read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public zapato_color readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
