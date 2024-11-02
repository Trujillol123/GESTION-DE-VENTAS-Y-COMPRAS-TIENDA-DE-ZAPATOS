/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import interfaces.DAODetalleVenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.ventazapato;

/**
 *
 * @author cland
 */
public class DAOVentaZapatoImpl extends DataBase.Database implements DAODetalleVenta{

    @Override
    public void create(ventazapato ventazapato) throws Exception {

         
    try {
        this.Conectar();
        PreparedStatement st = this.conexion.prepareStatement("INSERT INTO detalleventa (id_facturaventa, id_zapato , id_color , id_talla,  cantidad) VALUES ( ?, ?, ?, ?, ? )");
        
            
        
        
        st.setInt(1, ventazapato.getId_facturaventa()); 
        st.setInt(2, ventazapato.getId_zapato());  
        st.setInt(3, ventazapato.getId_color());
        st.setInt(4, ventazapato.getId_talla());
        st.setInt(5, ventazapato.getCantidad());
        
        st.executeUpdate();
            
                    
        } catch (Exception e) {
            
           throw  e;
        }   finally {
            
            this.Cerrar();
          
    }
        
    }

    @Override
    public List<ventazapato> read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ventazapato readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    @Override
    public void actualizarCantidadZapatoColor(int idZapato, int idColor, int cantidad) throws Exception {
        try {
               this.Conectar();
               PreparedStatement st = this.conexion.prepareStatement(
                   "UPDATE zapato_color SET cantidad = cantidad - ? WHERE id_zapato = ? AND id_color = ?"
               );
               st.setInt(1, cantidad);
               st.setInt(2, idZapato);
               st.setInt(3, idColor);

               // Ejecuta la actualización en zapato_color
               int rowsUpdated = st.executeUpdate();

               // Si no se encontró una entrada existente, inserta una nueva
               if (rowsUpdated == 0) {
                   st = this.conexion.prepareStatement(
                       "INSERT INTO zapato_color (id_zapato, id_color, cantidad) VALUES (?, ?, ?)"
                   );
                   st.setInt(1, idZapato);
                   st.setInt(2, idColor);
                   st.setInt(3, cantidad);
                   st.executeUpdate();
               }

           } catch (Exception e) {
               throw new Exception("Error al actualizar o eliminar en zapato_color: " + e.getMessage());
           } finally {
               this.Cerrar();
           }  

    }

    @Override
    public List<ventazapato> getDetallesPorFactura(int idFacturaVenta) throws Exception {

                List<ventazapato> detalles = new ArrayList<>();

          try {
              this.Conectar();
              String query = 
                  "SELECT d.id_zapato, z.descripcion, col.nombre_color, t.numero_talla, d.cantidad, z.precio_venta " +
                  "FROM detalleventa d " +
                  "JOIN zapato z ON d.id_zapato = z.id_zapato " +
                  "JOIN facturaventa f ON d.id_facturaventa = f.id_facturaventa " +
                  "JOIN colores col ON d.id_color = col.id_color " +
                  "JOIN talla t ON d.id_talla = t.id_talla " + 
                  "WHERE d.id_facturaventa = ?";

              PreparedStatement st = this.conexion.prepareStatement(query);
              st.setInt(1, idFacturaVenta);

              ResultSet rs = st.executeQuery();

              while (rs.next()) {
                  ventazapato detalle = new ventazapato();
                  detalle.setDescripcion(rs.getString("descripcion"));
                  detalle.setNombre_color(rs.getString("nombre_color"));
                  detalle.setNumero_talla(rs.getString("numero_talla"));
                  detalle.setCantidad(rs.getInt("cantidad"));
                  detalle.setPrecio_venta(rs.getFloat("precio_venta"));

                  // Calcular el subtotal
                  float subtotal = detalle.getPrecio_venta() * detalle.getCantidad();
                  detalle.setSubtotal(subtotal);

                  detalles.add(detalle);
              }
          } catch (Exception e) {
              throw e;
          } finally {
              this.Cerrar();
          }

          return detalles;
    }
}
