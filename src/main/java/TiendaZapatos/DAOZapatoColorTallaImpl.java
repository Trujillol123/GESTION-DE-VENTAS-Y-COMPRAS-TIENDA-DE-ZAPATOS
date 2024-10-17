/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOZapatoColorTalla;
import java.sql.PreparedStatement;
import java.util.List;
import models.zapato_color;
import models.zapatocolor_talla;

/**
 *
 * @author cland
 */
public class DAOZapatoColorTallaImpl extends Database implements DAOZapatoColorTalla  {

    @Override
    public void create(zapatocolor_talla zapatocolor_talla) throws Exception {
    try {
                this.Conectar();
                PreparedStatement st = this.conexion.prepareStatement(
                    "INSERT INTO zapatoColortalla ( id_talla, cantidad, id_zapatocolor ) VALUES (?,?,?)"
                );

                st.setInt(1, zapatocolor_talla.getId_talla());
                st.setInt(2, zapatocolor_talla.getCantidad());
                st.setInt(3, zapatocolor_talla.getId_zapatocolor());


                st.executeUpdate();
            } catch (Exception e) {
                throw e;
            } finally {
                this.Cerrar();
            }
        }        

    @Override
    public List<zapatocolor_talla> read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public zapatocolor_talla readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
