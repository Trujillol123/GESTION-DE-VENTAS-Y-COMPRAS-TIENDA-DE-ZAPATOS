/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOCliente;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.List;
import models.cliente;

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
            
            String fechaRegistroStr = cliente.getFecha_registro();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // Formato esperado
            java.util.Date utilDate = formato.parse(fechaRegistroStr); // Convierte String a Date
            Date sqlDate = new Date(utilDate.getTime()); // Convierte util.Date a sql.Date
            
            st.setDate(5, sqlDate); // Establece la fecha en el PreparedStatement
            st.executeUpdate();
                    
        } catch (Exception e) {
            
           throw  e;
        }   finally {
            
            this.Cerrar();
        }
    }

    @Override
    public List<cliente> read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
