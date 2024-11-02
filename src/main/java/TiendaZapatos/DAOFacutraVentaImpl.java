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
import java.util.ArrayList;
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

    
}
