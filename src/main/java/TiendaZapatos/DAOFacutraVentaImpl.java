/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import interfaces.DAOFacturacompra;
import interfaces.DAOFacturaventa;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.naming.ldap.Rdn;
import models.facturacompra;
import models.facturaventa;
import models.zapato;

/**
 *
 * @author cland
 */
public class DAOFacutraVentaImpl extends DataBase.Database implements DAOFacturaventa{

    @Override
    public int create(facturaventa facturaventa) throws Exception {
        
         int idFactura = 0;

        try {

            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                "INSERT INTO facturaventa (id_cliente, id_metodopago,  fecha_pago, cantidad_pagada) VALUES (?, ?, ?, ?)",
                PreparedStatement.RETURN_GENERATED_KEYS // Permite obtener el ID generado
            );

             
                System.out.println("ID Cliente: " + facturaventa.getId_cliente());
                System.out.println("ID Método de Pago: " + facturaventa.getId_metodopago());
                System.out.println("Fecha Pago: " + facturaventa.getFecha());
                System.out.println("Cantidad Pagada: " + facturaventa.getCantidad_pagada());
            

            st.setInt(1, facturaventa.getId_cliente());
            st.setInt(2, facturaventa.getId_metodopago());


            java.util.Date fechaRegistro = facturaventa.getFecha();
            if (fechaRegistro != null) {
                java.sql.Date sqlDate = new java.sql.Date(fechaRegistro.getTime());
                st.setDate(3, sqlDate);
            } else {
                st.setNull(3, java.sql.Types.DATE);
            }

            st.setFloat(4, facturaventa.getCantidad_pagada());


            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                idFactura = rs.getInt(1); 
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw e; 
        } finally {
            // Cerrar la conexión
            this.Cerrar();
        }

        return idFactura; 

        
    }
    
    
     @Override
        public void actualizarTotal(int idFacturaVenta, float cantidad_pagada, int totalCantidad) throws Exception {
             try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                "UPDATE facturaventa SET cantidad_pagada = ?, cantidad = ? WHERE id_facturaventa = ?"
            );


            st.setFloat(1, cantidad_pagada);
            st.setInt(2, totalCantidad);
            st.setInt(3, idFacturaVenta); 


            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(); 
            throw e;
        } finally {
            this.Cerrar(); 
        }
        }
    

    @Override
    public List<facturaventa> read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public facturaventa readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(facturaventa facturaventa) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<facturaventa> ReadNames() throws Exception {
        
        
             List<facturaventa> lista = new ArrayList<>();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                "SELECT facturaventa.id_facturaventa, cliente.nombre, metodopago.nombre_metodopago, facturaventa.fecha_pago, facturaventa.cantidad, facturaventa.cantidad_pagada " +
                "FROM facturaventa " +
                "JOIN cliente ON facturaventa.id_cliente = cliente.id_cliente " +
                "JOIN metodopago ON facturaventa.id_metodopago = metodopago.id_metodopago"  
            );

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                
                facturaventa facturaventa = new facturaventa();
                
                facturaventa.setId_facturaventa(rs.getInt("id_facturaventa"));
                facturaventa.setNombre_cliente(rs.getString("nombre"));
                facturaventa.setNombre_metodopago(rs.getString("nombre_metodopago"));
                facturaventa.setCantidad(rs.getInt("cantidad"));
                facturaventa.setFecha(rs.getDate("fecha_pago"));
                facturaventa.setCantidad_Pagada(rs.getInt("cantidad_pagada"));
                
                
                lista.add(facturaventa);
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
    public List<facturaventa> buscarVenta(String query) throws Exception {
        
         
    List<facturaventa> ventas = new ArrayList<>();

    try {
        this.Conectar();
        
        String sql = "SELECT f.id_facturaventa, c.nombre, m.nombre_metodopago, f.cantidad, f.fecha_pago, f.cantidad_pagada " +
                     "FROM facturaventa f " +
                     "JOIN cliente c ON f.id_cliente = c.id_cliente " +
                     "JOIN metodopago m ON f.id_metodopago = m.id_metodopago " +
                     
                     "WHERE c.nombre LIKE ? OR f.id_facturaventa LIKE ? OR m.nombre_metodopago LIKE ? OR " +
                     "f.cantidad LIKE ? OR f.fecha_pago LIKE ? OR f.cantidad_pagada LIKE ?";

        PreparedStatement st = this.conexion.prepareStatement(sql);
        String searchPattern = "%" + query + "%"; // Para buscar en todos los campos
        st.setString(1, searchPattern); 
        st.setString(2, searchPattern); 
        st.setString(3, searchPattern); 
        st.setString(4, searchPattern); 
        st.setString(5, searchPattern);
        st.setString(6, searchPattern);
         
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            facturaventa venta = new facturaventa(); // Cambié el nombre de la variable aquí
            
            
            
            venta.setId_facturaventa(rs.getInt("id_facturaventa"));
            venta.setNombre_cliente(rs.getString("nombre"));
            venta.setNombre_metodopago(rs.getString("nombre_metodopago")); // Corregido el nombre del campo
            venta.setCantidad(rs.getInt("cantidad"));
            venta.setFecha(rs.getDate("fecha_pago"));
            venta.setCantidad_Pagada(rs.getFloat("cantidad_pagada"));
            
            ventas.add(venta); // Agregamos el objeto venta a la lista
        }
    } catch (SQLException e) {
        System.out.println("Error al buscar las facturas: " + e.getMessage());
    } finally {
        this.Cerrar(); 
    }

    return ventas;
    }
   
    
    
    @Override
    public Map<Date, Float> getVentasPorFecha() throws Exception {
        
            Map<Date, Float> ventasPorFecha = new HashMap<>();

            try {
                this.Conectar();
                PreparedStatement st = this.conexion.prepareStatement(
                    "SELECT fecha_pago, SUM(cantidad_pagada) as total_vendido " +
                    "FROM facturaventa " +
                    "GROUP BY fecha_pago"
                );

                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    ventasPorFecha.put(rs.getDate("fecha_pago"), rs.getFloat("total_vendido"));
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            } finally {
                this.Cerrar();
            } 
            return ventasPorFecha;
        }

        @Override
    public List<facturaventa> buscarVentaPorFechas(Date fechaInicio, Date fechaFin) throws Exception {
        List<facturaventa> ventas = new ArrayList<>();

        try {
            this.Conectar();

            String sql = "SELECT f.id_facturaventa, c.nombre AS nombre_cliente, m.nombre_metodopago, f.cantidad, f.fecha_pago, f.cantidad_pagada " +
                         "FROM facturaventa f " +
                         "JOIN cliente c ON f.id_cliente = c.id_cliente " +
                         "JOIN metodopago m ON f.id_metodopago = m.id_metodopago " +
                         "WHERE f.fecha_pago >= ? AND f.fecha_pago <= ? " +
                         "ORDER BY f.fecha_pago";

            PreparedStatement st = this.conexion.prepareStatement(sql);
            st.setDate(1, fechaInicio);
            st.setDate(2, fechaFin);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                facturaventa venta = new facturaventa();
                venta.setId_facturaventa(rs.getInt("id_facturaventa"));
                venta.setNombre_cliente(rs.getString("nombre_cliente"));
                venta.setNombre_metodopago(rs.getString("nombre_metodopago"));
                venta.setCantidad(rs.getInt("cantidad"));
                venta.setFecha(rs.getDate("fecha_pago"));
                venta.setCantidad_Pagada(rs.getFloat("cantidad_pagada"));

                ventas.add(venta);
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            this.Cerrar();
        }

        return ventas;
}
        @Override
        public Map<String, Object> obtenerVentasDelDia() throws Exception {
            Map<String, Object> ventasDelDia = new HashMap<>();

            try {
                this.Conectar();
                java.sql.Date fechaActual = new java.sql.Date(Calendar.getInstance().getTime().getTime());

                PreparedStatement st = this.conexion.prepareStatement(
                    "SELECT SUM(cantidad) AS total_zapatos, SUM(cantidad * cantidad_pagada) AS total_ventas " +
                    "FROM facturaventa " +
                    "WHERE fecha_pago = ?"
                );
                st.setDate(1, fechaActual);

                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    ventasDelDia.put("total_zapatos", rs.getInt("total_zapatos"));  // int para total_zapatos
                    ventasDelDia.put("total_ventas", rs.getFloat("total_ventas"));  // float para total_ventas
                }

                rs.close();
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new Exception("Error al obtener las ventas del día", e);
            } finally {
                this.Cerrar();
            }

            return ventasDelDia;
        }
        
         @Override
         public float obtenerVentasDelMes() throws Exception {
             
            float totalVentasMes = 0;

            try {
                this.Conectar();

                // Consulta para obtener el total del mes actual
                PreparedStatement st = this.conexion.prepareStatement(
                    "SELECT SUM(cantidad_pagada) AS total_ventas_mes " +
                    "FROM facturaventa " +
                    "WHERE MONTH(fecha_pago) = MONTH(CURRENT_DATE()) AND YEAR(fecha_pago) = YEAR(CURRENT_DATE())"
                );

                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    totalVentasMes = rs.getFloat("total_ventas_mes");
                }

                rs.close();
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new Exception("Error al obtener las ventas del mes", e);
            } finally {
                this.Cerrar();
            }

            return totalVentasMes;
        }

         
      @Override
      public Map<String, Integer> obtenerProductoMasVendidoDelMes(int mes, int año) throws Exception {
          Map<String, Integer> productoMasVendido = new HashMap<>();

          try {
              // Conecta a la base de datos
              this.Conectar();

              // Consulta para obtener el producto más vendido del mes
              PreparedStatement st = this.conexion.prepareStatement(
                  "SELECT z.descripcion AS zapato, SUM(dv.cantidad) AS total_vendido " +
                  "FROM facturaventa fv " +
                  "JOIN detalleventa dv ON fv.id_facturaventa = dv.id_facturaventa " +
                  "JOIN zapato z ON dv.id_zapato = z.id_zapato " +
                  "WHERE MONTH(fv.fecha_pago) = ? AND YEAR(fv.fecha_pago) = ? " +
                  "GROUP BY z.id_zapato " +
                  "ORDER BY total_vendido DESC " +
                  "LIMIT 1"
              );

              // Asigna los parámetros de mes y año
              st.setInt(1, mes);
              st.setInt(2, año);

              // Ejecuta la consulta
              ResultSet rs = st.executeQuery();

              // Procesa el resultado
              if (rs.next()) {
                  String nombreZapato = rs.getString("zapato");
                  int cantidadVendida = rs.getInt("total_vendido");
                  productoMasVendido.put(nombreZapato, cantidadVendida);
              }

              // Cierra el ResultSet y el PreparedStatement
              rs.close();
              st.close();

          } catch (SQLException e) {
              e.printStackTrace();
              throw new Exception("Error al obtener el producto más vendido del mes", e);
          } finally {
              // Cierra la conexión
              this.Cerrar();
          }

          return productoMasVendido;
      }
}
