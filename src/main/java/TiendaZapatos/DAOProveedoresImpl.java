/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOProveedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.proveedor;

/**
 *
 * @author cland
 */
public class DAOProveedoresImpl extends Database implements DAOProveedor {

    @Override
    public void create(proveedor proveedor) throws Exception {
  try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO proveedor (nombre_proveedor, telefono, email, direccion, id_marca) VALUES (?, ?, ?, ?, ?)");
        
        st.setString(1, proveedor.getNombre_proveedor());
        st.setString(2, proveedor.getTelefono());
        st.setString(3, proveedor.getEmail());
        st.setString(4, proveedor.getDireccion());
        
        // Aquí se asume que 'proveedor' tiene un método getId_marca()
        st.setInt(5, proveedor.getid_marca()); // Asumiendo que id_marca es un entero
            
        

        st.executeUpdate();
            
                    
        } catch (Exception e) {
            
           throw  e;
        }   finally {
            
            this.Cerrar();
        }
    }    

    @Override
    public List<proveedor> read() throws Exception {
        
        List<proveedor> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM proveedor;");
            
             lista = new ArrayList();
             ResultSet rs = st.executeQuery();
             while (rs.next()) {
                 proveedor proveedor = new proveedor ();
                 
                 proveedor.setId_proveedor(rs.getInt("id_proveedor"));
                 proveedor.setid_marca(rs.getInt("id_marca"));
                 proveedor.setNombre_proveedor(rs.getString("nombre_proveedor"));
                 proveedor.setDireccion(rs.getString("telefono"));
                 proveedor.setDireccion(rs.getString("email"));
                 proveedor.setDireccion(rs.getString("direccion"));
                 
                 lista.add(proveedor);
                 
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
    public proveedor readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(proveedor proveedor) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id_proveedor) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM proveedor WHERE id_proveedor = ?;");
           
            st.setInt(1, id_proveedor);
            st.executeUpdate();
            st.close();
                    
        } catch (Exception e) {
            
           throw  e;
        }   finally {
            
            this.Cerrar();
        }
        }
    
}
