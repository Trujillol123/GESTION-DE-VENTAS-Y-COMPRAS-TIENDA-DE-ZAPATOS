/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOComprazapato;
import interfaces.DAOZapato;
import java.sql.PreparedStatement;
import java.util.List;
import models.comprazapato;
import models.zapato;

/**
 *
 * @author cland
 */
public class DAOCompraZapatoImpl extends Database implements DAOComprazapato {

    @Override
    public void create(comprazapato compraZapato) throws Exception {

   
    try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO comprazapato (id_comprazpato, id_zapato, id_facturacompra, id_color, id_talla) VALUES (?, ?, ?, ?, ?)");
        
            
        st.setInt(1, compraZapato.getId_comprazapato()); 
        st.setInt(2, compraZapato.getId_zapato());
        st.setInt(2, compraZapato.getId_facturacompra()); 
        st.setInt(3, compraZapato.getId_color());
        st.setInt(4, compraZapato.getId_talla());

        
        st.executeUpdate();
            
                    
        } catch (Exception e) {
            
           throw  e;
        }   finally {
            
            this.Cerrar();
          
    }
    }
    
    @Override
    public List<comprazapato> read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public comprazapato readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
