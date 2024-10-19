/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOProveedor;
import interfaces.DAOZapato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.proveedor;
import models.zapato;

/**
 *
 * @author cland
 */
public class DAOGestionProductosImpl  extends Database implements DAOZapato {

    @Override
    public void create(zapato zapato) throws Exception {
    try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO zapato (id_categoria, id_marca, id_proveedor, precio, stock, descripcion) VALUES (?, ?, ?, ?, ?, ?)");
        
        st.setInt(1, zapato.getId_categoria()); // Asumiendo que id_marca es un entero    
        st.setInt(2, zapato.getId_marca()); // Asumiendo que id_marca es un entero
        st.setInt(3, zapato.getId_proveedor());
        st.setFloat(4, zapato.getPrecio());
        st.setInt(5, zapato.getStock());
        st.setString(6, zapato.getDescripcion());
        
            
        

        st.executeUpdate();
            
                    
        } catch (Exception e) {
            
           throw  e;
        }   finally {
            
            this.Cerrar();
        }
    }        

    @Override
    public List<zapato> read() throws Exception {
          List<zapato> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM zapato;");
            
             lista = new ArrayList();
             ResultSet rs = st.executeQuery();
             while (rs.next()) {
                 zapato zapato = new zapato ();
                 
                 zapato.setId_zapato(rs.getInt("id_zapato"));
                 zapato.setId_categoria(rs.getInt("id_categoria"));   
                 zapato.setId_marca(rs.getInt("id_marca"));            
                 zapato.setId_proveedor(rs.getInt("id_proveedor"));
                 zapato.setPrecio(rs.getFloat("telefono"));
                 zapato.setStock(rs.getInt("stock"));
                 zapato.setDescripcion(rs.getString("descripcion"));
                 
                 lista.add(zapato);
                 
             }
            
             rs.close();
             st.close();
        } catch (Exception e) {
             throw  e;
        }   finally {
            
            this.Cerrar();
        }   
        return lista;
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
