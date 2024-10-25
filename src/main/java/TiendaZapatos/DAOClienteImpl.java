/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOCliente;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.cliente;
import views.Clientes;


/**
 *
 * @author cland
 */
public class DAOClienteImpl extends Database implements DAOCliente{

    @Override
    public void create(cliente cliente) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO cliente ( nombre, email, telefono, direccion, fecha_registro) VALUES (?,?,?,?,?)");
           
            st.setString(1, cliente.getNombre());
            st.setString (2, cliente.getEmail());
            st.setString(3, cliente.getTelefono());
            st.setString(4, cliente.getDireccion());
            
            //  un objeto java.util.Date en el cliente, e convierte directamente a java.sql.Date
        java.util.Date fechaRegistro = cliente.getFecha_registro();
        if (fechaRegistro != null) {
            java.sql.Date sqlDate = new java.sql.Date(fechaRegistro.getTime()); // Convertir util.Date a sql.Date
            st.setDate(5, sqlDate); // Establecer la fecha en el PreparedStatement
        } else {
            st.setNull(5, java.sql.Types.DATE); // Manejo si no se proporciona fecha
        }

        st.executeUpdate();

                    
        } catch (Exception e) {
            
           throw  e;
        }   finally {
            
            this.Cerrar();
        }
    }

    @Override
    public List<cliente> read() throws Exception {
        
        List<cliente> lista = null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM cliente;");
            
             lista = new ArrayList();
             ResultSet rs = st.executeQuery();
             while (rs.next()) {
                 cliente cliente = new cliente ();
                 
                 cliente.setId_cliente(rs.getInt("id_cliente"));
                 cliente.setNombre(rs.getString("nombre"));
                 cliente.setEmail(rs.getString("email"));
                 cliente.setDireccion(rs.getString("direccion"));
                 cliente.setFecha_registro(rs.getDate("fecha_registro"));
                 lista.add(cliente);
                 
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
    public cliente readById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id_cliente)throws Exception {
         
        // Pregunta al usuario si está seguro de borrar el zapato

        int respuesta = JOptionPane.showConfirmDialog(null, 
            "¿Estás seguro de que deseas borrar el cliente seleccionado?", 
            "Confirmar Borrado", 
            JOptionPane.YES_NO_OPTION);

        // Si el usuario selecciona "Si"

        if (respuesta == JOptionPane.YES_OPTION) {   

        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM cliente WHERE id_cliente = ?;");
           
            st.setInt(1, id_cliente);
            st.executeUpdate();
            st.close();
            JOptionPane.showMessageDialog(null, "Cliente borrado con éxito.");        
            
        } catch (Exception e) {
            
           throw  e;
        }   finally {
            
            this.Cerrar();
        }
      } else {
        // Si el usuario selecciona "No"
        JOptionPane.showMessageDialog(null, "Operación de borrado cancelada.");
    }
       
    }

    @Override
        public cliente getclientebyid(int id_cliente) throws Exception {

            cliente cliente = new cliente();


            try {
                this.Conectar();
                PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM cliente WHERE id_cliente = ? LIMIT 1;");
                st.setInt(1, id_cliente);
                ResultSet rs = st.executeQuery();
                while (rs.next()) {

                     cliente.setId_cliente(rs.getInt("id_cliente"));
                     cliente.setNombre(rs.getString("nombre"));
                     cliente.setEmail(rs.getString("email"));
                     cliente.setDireccion(rs.getString("direccion"));
                     cliente.setTelefono(rs.getString("telefono"));
                     cliente.setFecha_registro(rs.getDate("fecha_registro"));


                 }

                 rs.close();
                 st.close();
            } catch (Exception e) {
                 throw  e;
            }   finally {

                this.Cerrar();
            }   
            return cliente;
             }


    }
