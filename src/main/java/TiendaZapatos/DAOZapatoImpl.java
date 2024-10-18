/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOZapato;
import java.sql.PreparedStatement;
import java.util.List;
import models.comprazapato;
import models.zapato;

/**
 *
 * @author cland
 */
public class DAOZapatoImpl extends Database implements DAOZapato{

    @Override
    public void create(zapato zapato) throws Exception {


   
    try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO zapato (id_zapato, id_categoria, id_marca, id_proveedor, precio, stock, descripcion) VALUES (?, ?, ?, ?, ?, ?, ?)");
        
            
        st.setInt(1, zapato.getId_categoria()); 
        st.setInt(2, zapato.getId_marca());
        st.setInt(3, zapato.getId_proveedor()); 
        st.setFloat(4, zapato.getPrecio());
        st.setString(5, zapato.getDescripcion());
     
        

        
        st.executeUpdate();
            
                    
        } catch (Exception e) {
            
           throw  e;
        }   finally {
            
            this.Cerrar();
          
        }}

    @Override
    public List<zapato> read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public zapato readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(zapato zapato) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
