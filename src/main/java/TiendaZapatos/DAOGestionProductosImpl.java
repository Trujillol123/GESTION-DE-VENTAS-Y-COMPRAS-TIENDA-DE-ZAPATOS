
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOZapato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import models.zapato;
import models.zapato_color;

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
        
        st.setInt(1, zapato.getId_categoria());  
        st.setInt(2, zapato.getId_marca()); 
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
    public void delete(int id_zapato) throws Exception {
        
   
    
    int respuesta = JOptionPane.showConfirmDialog(null, 
        "¿Estás seguro de que deseas borrar el zapato seleccionado?", 
        "Confirmar Borrado", 
        JOptionPane.YES_NO_OPTION);
    
    
    
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
                       int idZapato = rs.getInt("id_zapato");
                       String descripcion = rs.getString("descripcion");
                       int idProveedor = rs.getInt("id_proveedor");                      
                       
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
                
                    float precioCompra = 0; // iniocializo el valor de la compra 

                try {

                    this.Conectar();

                    // Consulta para obtener el precio de compra del zapato por su ID
                    String sql = "SELECT precio_compra FROM zapato WHERE id_zapato = ?";
                    PreparedStatement st = this.conexion.prepareStatement(sql);
                    
                    st.setInt(1, idZapato); 

                    ResultSet rs = st.executeQuery();

                  
                    if (rs.next()) {
                        precioCompra = rs.getFloat("precio_compra");
                    }

                
                    rs.close();
                    st.close();

                } catch (SQLException e) {
                    throw new Exception("Error al obtener el precio de compra del zapato: " + e.getMessage(), e);
                } finally {
                    
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

    @Override
    public void actualizarCantidadZapato(int idZapato, int cantidadComprada) throws Exception {
        try {
                this.Conectar();
                PreparedStatement st = this.conexion.prepareStatement(
                    "UPDATE zapato SET cantidad = cantidad + ? WHERE id_zapato = ?"
                );
                st.setInt(1, cantidadComprada);
                st.setInt(2, idZapato);
                st.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            } finally {
                this.Cerrar();
            }    
        }

    @Override
    public List<zapato> buscarZapato(String query) throws Exception {
        List<zapato> zapatos = new ArrayList<>();

           try {
               this.Conectar();
               
               
               // SUPER QUERRY DEL DESTINO FINAL 2 
               
               
              
               String sql =  "SELECT z.id_zapato, c.nombre_categoria, m.nombre_marca, p.nombre_proveedor, " +
                                "z.precio_compra, z.precio_venta, z.cantidad, z.descripcion " +
                                "FROM zapato z " +
                                "JOIN categoria c ON z.id_categoria = c.id_categoria " +
                                "JOIN marca m ON z.id_marca = m.id_marca " +
                                "JOIN proveedor p ON z.id_proveedor = p.id_proveedor " +
                                "WHERE p.nombre_proveedor LIKE ? OR z.id_zapato LIKE ? OR " +
                                "c.nombre_categoria LIKE ? OR m.nombre_marca LIKE ? OR " +
                                "z.precio_compra LIKE ? OR z.precio_venta LIKE ? OR " +
                                "z.cantidad LIKE ? OR z.descripcion LIKE ?";
                            

               PreparedStatement st = this.conexion.prepareStatement(sql);
               String searchPattern = "%" + query + "%"; // Para buscar en todos los campos
               st.setString(1, searchPattern); 
               st.setString(2, searchPattern); 
               st.setString(3, searchPattern); 
               st.setString(4, searchPattern); 
               st.setString(5, searchPattern);
               st.setString(6, searchPattern);
               st.setString(7, searchPattern);
               st.setString(8, searchPattern);
               ResultSet rs = st.executeQuery();

               while (rs.next()) {
                   zapato zapato = new zapato();
                   zapato.setId_zapato(rs.getInt("id_zapato"));
                   zapato.setNombre_categoria(rs.getNString ("nombre_categoria"));
                   zapato.setNombre_marca(rs.getString("nombre_marca"));
                   zapato.setNombre_proveedor(rs.getString("nombre_proveedor"));
                   zapato.setPrecio_compra(rs.getFloat("precio_compra"));
                   zapato.setPrecio_venta(rs.getFloat("precio_venta"));
                   zapato.setCantidad(rs.getInt("cantidad"));
                   zapato.setDescripcion(rs.getString("descripcion"));
            

                   zapatos.add(zapato);
               }
           } catch (SQLException e) {
               System.out.println("Error al buscar las facturas: " + e.getMessage());
           } finally {
               this.Cerrar(); 
           }

           return zapatos;
           }    

    @Override
    public float getPrecioVentaPorZapato(int idZapato) throws Exception {

           
                    float precioVenta = 0; // iniocializo el valor de la compra 

                try {

                    this.Conectar();

                    // Consulta para obtener el precio de compra del zapato por su ID
                    String sql = "SELECT precio_venta FROM zapato WHERE id_zapato = ?";
                    PreparedStatement st = this.conexion.prepareStatement(sql);
                    
                    st.setInt(1, idZapato); 

                    ResultSet rs = st.executeQuery();

                  
                    if (rs.next()) {
                        precioVenta = rs.getFloat("precio_venta");
                    }

                
                    rs.close();
                    st.close();

                } catch (SQLException e) {
                    throw new Exception("Error al obtener el precio de venta del zapato: " + e.getMessage(), e);
                } finally {
                    
                    this.Cerrar();
                }

                return precioVenta; // Devolver el precio de compra
    }

    @Override
    public List<zapato_color> obtenerColoresZapatoConCantidad(int idZapato) throws Exception {
        
         List<zapato_color> coloresZapato = new ArrayList<>();

        try {
            this.Conectar();
            String query = "SELECT zc.id_zapatocolor, zc.id_zapato, z.descripcion, zc.cantidad, col.nombre_color " +
                           "FROM zapato_color zc " +
                           "JOIN zapato z ON zc.id_zapato = z.id_zapato " +
                           "JOIN colores col ON zc.id_color = col.id_color " +
                           "WHERE zc.id_zapato = ? AND zc.cantidad > 0";

            PreparedStatement st = this.conexion.prepareStatement(query);
            st.setInt(1, idZapato);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                zapato_color color = new zapato_color();
                color.setId_zapatocolor(rs.getInt("id_zapatocolor"));
                color.setId_zapato(rs.getInt("id_zapato"));
                color.setnombre_zapato(rs.getString("descripcion"));
                color.setCantidad(rs.getInt("cantidad"));
                color.setNombreColor(rs.getString("nombre_color"));
                coloresZapato.add(color);
            }

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }

        return coloresZapato;


        }

    @Override
    public void actualizatCantidadZapatoVendido(int idZapato, int cantidadVendidad) throws Exception {

        try {
                this.Conectar();
                PreparedStatement st = this.conexion.prepareStatement(
                    "UPDATE zapato SET cantidad = cantidad - ? WHERE id_zapato = ?"
                );
                st.setInt(1, cantidadVendidad);
                st.setInt(2, idZapato);
                st.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            } finally {
                this.Cerrar();
            }    
        
        
    }
    }