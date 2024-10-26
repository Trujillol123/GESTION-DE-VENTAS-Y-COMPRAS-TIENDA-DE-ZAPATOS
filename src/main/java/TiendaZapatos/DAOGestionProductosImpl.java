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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO zapato (id_categoria, id_marca, id_proveedor, precio_compra, precio_venta, cantidad, descripcion) VALUES (?, ?, ?, ?, ?, ?, ?)");
        
        st.setInt(1, zapato.getId_categoria()); // Asumiendo que id_marca es un entero    
        st.setInt(2, zapato.getId_marca()); // Asumiendo que id_marca es un entero
        st.setInt(3, zapato.getId_proveedor());
        st.setFloat(4, zapato.getPrecio_compra());
        st.setFloat(5, zapato.getPrecio_venta());
        st.setInt(6, zapato.getCantidad());
        st.setString(7, zapato.getDescripcion());
        
            
        

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
                 zapato.setPrecio_compra(rs.getFloat("precio_compra"));
                 zapato.setPrecio_venta(rs.getFloat("precio_venta"));
                 zapato.setCantidad(rs.getInt("cantidad"));
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
    public zapato readById(int id_zapato) throws Exception {
            
            zapato zapato = new zapato();


            try {
                this.Conectar();
                PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM zapato WHERE id_zapato = ? LIMIT 1;");
                st.setInt(1, id_zapato);
                ResultSet rs = st.executeQuery();
                while (rs.next()) {

                     zapato.setId_zapato(rs.getInt("id_zapato"));
                     zapato.setId_categoria(rs.getInt("id_categoria"));
                     zapato.setId_marca(rs.getInt("id_marca"));
                     zapato.setId_proveedor(rs.getInt("id_proveedor"));
                     zapato.setPrecio_venta(rs.getFloat("precio_venta"));
                     zapato.setDescripcion(rs.getString("descripcion"));


                 }

                 rs.close();
                 st.close();
            } catch (Exception e) {
                 throw  e;
            }   finally {

                this.Cerrar();
            }   
            return zapato;
             }

    

    @Override
    public void update(zapato zapato) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id_zapato) throws Exception {
        
    // Pregunta al usuario si está seguro de borrar el zapato
    
    int respuesta = JOptionPane.showConfirmDialog(null, 
        "¿Estás seguro de que deseas borrar el zapato seleccionado?", 
        "Confirmar Borrado", 
        JOptionPane.YES_NO_OPTION);
    
    // Si el usuario selecciona "Si"
    
    if (respuesta == JOptionPane.YES_OPTION) {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM zapato WHERE id_zapato = ?;");
            st.setInt(1, id_zapato);
            st.executeUpdate();
            st.close();
            JOptionPane.showMessageDialog(null, "Zapato borrado con éxito.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al borrar el zapato: " + e.getMessage());
            throw e;
        } finally {
            this.Cerrar();
        }
    } else {
        // Si el usuario selecciona "No"
        JOptionPane.showMessageDialog(null, "Operación de borrado cancelada.");
    }
    }

    @Override
    public List<zapato> ReadNames() throws Exception {
         List<zapato> lista = new ArrayList<>();
    try {
        this.Conectar();
        PreparedStatement st = this.conexion.prepareStatement(
            "SELECT zapato.id_zapato, categoria.nombre_categoria, marca.nombre_marca, proveedor.nombre_proveedor, zapato.precio_venta, zapato.precio_compra, zapato.cantidad, zapato.descripcion " +
            "FROM zapato " +
            "JOIN categoria ON zapato.id_categoria = categoria.id_categoria " +
            "JOIN marca ON zapato.id_marca = marca.id_marca " +
            "JOIN proveedor ON zapato.id_proveedor = proveedor.id_proveedor;"
        );

        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            zapato zapato = new zapato();
            zapato.setId_zapato(rs.getInt("id_zapato"));
            zapato.setNombre_categoria(rs.getString("nombre_categoria"));
            zapato.setNombre_marca(rs.getString("nombre_marca"));
            zapato.setNombre_proveedor(rs.getString("nombre_proveedor"));
            zapato.setPrecio_compra(rs.getFloat("precio_compra"));
            zapato.setPrecio_venta(rs.getFloat("precio_venta"));
            zapato.setCantidad(rs.getInt("cantidad"));
            zapato.setDescripcion(rs.getString("descripcion"));
            lista.add(zapato);
        }

        rs.close();
        st.close();
    } catch (Exception e) {
        throw e;
    } finally {
        this.Cerrar();
    }
    return lista;
}

    @Override
    public List<zapato> getallZapatos() throws Exception {
        
    List<zapato> lista = new ArrayList<>();
            try {
                this.Conectar();
                 PreparedStatement st = this.conexion.prepareStatement("SELECT id_zapato, descripcion, id_proveedor FROM zapato;"); 
                 ResultSet rs = st.executeQuery();
                while (rs.next()) {
                                // Asegúrate de que tu clase zapato tenga un constructor que acepte el id_proveedor
                       int idZapato = rs.getInt("id_zapato");
                       String descripcion = rs.getString("descripcion");
                       int idProveedor = rs.getInt("id_proveedor"); // Asegúrate de que esta columna exista en la base de datos
                       
                       
                       
                       zapato zapato = new zapato(idZapato,  idProveedor, descripcion ); // Constructor modificado
            lista.add(zapato);
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

    @Override
    public float getPrecioCompraPorZapato(int idZapato) throws Exception {
                
                    float precioCompra = 0; // Inicializamos el valor del precio de compra

                try {

                    this.Conectar();

                    // Consulta para obtener el precio de compra del zapato por su ID
                    String sql = "SELECT precio_compra FROM zapato WHERE id_zapato = ?";
                    PreparedStatement st = this.conexion.prepareStatement(sql);
                    
                    st.setInt(1, idZapato); // Se establece el ID del zapato en la consulta

                    ResultSet rs = st.executeQuery();

                    // Si hay resultados, asignar el valor del precio de compra
                    if (rs.next()) {
                        precioCompra = rs.getFloat("precio_compra");
                    }

                    // Cerrar ResultSet y PreparedStatement
                    rs.close();
                    st.close();

                } catch (SQLException e) {
                    throw new Exception("Error al obtener el precio de compra del zapato: " + e.getMessage(), e);
                } finally {
                    // Cerrar la conexión a la base de datos
                    this.Cerrar();
                }

                return precioCompra; // Devolver el precio de compra
            }
     
    @Override
    public int obtenerIdPorNombre(String nombreZapato) throws Exception {
           int idZapato = -1;
    String sql = "SELECT id_zapato FROM zapato WHERE descripcion = ?";

    try {
        this.Conectar(); 
        PreparedStatement stmt = this.conexion.prepareStatement(sql);
        stmt.setString(1, nombreZapato);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            idZapato = rs.getInt("id_zapato");
        }
        rs.close();
        stmt.close();
    } catch (SQLException e) {
        throw new SQLException("Error al obtener el ID por nombre: " + e.getMessage(), e);
    } finally {
        this.Cerrar();
    }
    return idZapato;
                

    }
    }