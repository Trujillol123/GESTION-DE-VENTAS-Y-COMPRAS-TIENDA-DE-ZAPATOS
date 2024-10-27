/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOProveedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        
       
        st.setInt(5, proveedor.getid_marca()); 
            
        

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
                 proveedor.setTelefono(rs.getString("telefono"));
                 proveedor.setEmail(rs.getString("email"));
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
    public proveedor readById(int id_proveedor) throws Exception {
    proveedor proveedor = null; // Inicializar el objeto proveedor a null
    try {
        this.Conectar();
        PreparedStatement st = this.conexion.prepareStatement("SELECT id_proveedor, nombre_proveedor, id_marca FROM proveedor WHERE id_proveedor = ?;");
        st.setInt(1, id_proveedor); 
        ResultSet rs = st.executeQuery(); 
        
        if (rs.next()) {
            int idProveedor = rs.getInt("id_proveedor");
            int idMarca = rs.getInt("id_marca"); 
            String nombre_proveedor = rs.getString("nombre_proveedor");
            
          
            proveedor = new proveedor(idProveedor, idMarca, nombre_proveedor);
        }
        
        rs.close();
        st.close();
    } catch (SQLException e) {
        throw new Exception("Error al obtener el proveedor: " + e.getMessage(), e);
    } finally {
        this.Cerrar(); 
    }
    return proveedor; 
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

    @Override
    public List<proveedor> getAllProveedores() throws Exception {
        
    List<proveedor> lista = new ArrayList<>();
            try {
                this.Conectar();
                 PreparedStatement st = this.conexion.prepareStatement("SELECT id_proveedor, nombre_proveedor, id_marca FROM proveedor;"); 
        ResultSet rs = st.executeQuery();
                while (rs.next()) {
                               
                       int idProveedor = rs.getInt("id_proveedor"); 
                       int id_marca = rs.getInt("id_marca"); 
                       String nombre_proveedor = rs.getString("nombre_proveedor");
                       

                       proveedor proveedor = new proveedor(idProveedor,  id_marca, nombre_proveedor); 
            lista.add(proveedor);
                }
                rs.close();
                st.close();
            } catch (SQLException e) {
                throw new Exception("Error al obtener marcas: " + e.getMessage(), e);
            } finally {
                this.Cerrar();
            }
            return lista;
    }  
        }
    

