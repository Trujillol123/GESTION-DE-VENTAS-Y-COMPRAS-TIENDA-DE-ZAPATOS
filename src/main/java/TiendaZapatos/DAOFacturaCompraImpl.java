/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import interfaces.DAOFacturacompra;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.facturacompra;
import models.zapato;

/**
 *
 * @author cland
 */
    public class DAOFacturaCompraImpl extends DataBase.Database implements DAOFacturacompra{

  

    @Override
    public int create (facturacompra factura) throws Exception {

         int idFactura = 0;
        
    try {
        // Conectarse a la base de datos
        this.Conectar();
        PreparedStatement st = this.conexion.prepareStatement(
            "INSERT INTO facturacompra (id_proveedor, cantidad, fecha, total) VALUES (?, ?, ?, ?)",
            PreparedStatement.RETURN_GENERATED_KEYS // Permite obtener el ID generado
        );

        // Establecer parámetros
        st.setInt(1, factura.getId_proveedor());
        st.setFloat(2, factura.getCantidad());
       
        
        java.util.Date fechaRegistro = factura.getFecha();
        if (fechaRegistro != null) {
            java.sql.Date sqlDate = new java.sql.Date(fechaRegistro.getTime());
            st.setDate(3, sqlDate);
        } else {
            st.setNull(3, java.sql.Types.DATE);
        }
        
        st.setFloat(4, factura.getTotal());
        
        // Ejecutar la inserción y obtener el ID generado
        st.executeUpdate();
        ResultSet rs = st.getGeneratedKeys();
        if (rs.next()) {
            idFactura = rs.getInt(1); // Obtener el ID generado
        }

    } catch (Exception e) {
        e.printStackTrace(); // Mostrar el error en la consola para depuración
        throw e; // Volver a lanzar la excepción
    } finally {
        // Cerrar la conexión
        this.Cerrar();
    }

    return idFactura; // Retornar el ID generado
     
    }
    

    @Override
    public List<facturacompra> read() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public facturacompra readById(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(facturacompra facturacompra) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    public int Crear(facturacompra facturacompra) throws Exception {
    int idFactura = 0; // Inicializamos el ID
    
    try {
        this.Conectar();
        
        // Preparamos el Statement y solicitamos que devuelva las claves generadas
        PreparedStatement st = this.conexion.prepareStatement(
            "INSERT INTO facturacompra (id_proveedor, cantidad, fecha) VALUES (?, ?, ?)",
            Statement.RETURN_GENERATED_KEYS
        );
        
        
        st.setInt(1, facturacompra.getId_proveedor()); 
        st.setInt(2,facturacompra.getCantidad());
        
        
         //  un objeto java.util.Date en el cliente, e convierte directamente a java.sql.Date
        java.util.Date fechaRegistro = facturacompra.getFecha();
        if (fechaRegistro != null) {
            java.sql.Date sqlDate = new java.sql.Date(fechaRegistro.getTime()); // Convertir util.Date a sql.Date
            st.setDate(3, sqlDate); // Establecer la fecha en el PreparedStatement
        } else {
            st.setNull(3, java.sql.Types.DATE); // Manejo si no se proporciona fecha
        }
       
        
        // Ejecutamos la actualización
        st.executeUpdate();
        
        // Obtenemos las claves generadas (en este caso el ID)
        try (ResultSet rs = st.getGeneratedKeys()) {
            if (rs.next()) {
                idFactura = rs.getInt(1); // Capturamos el ID generado
            }
        }
        
    } catch (Exception e) {
        throw e; // Lanzamos cualquier excepción encontrada
    } finally {
        this.Cerrar(); // Cerramos la conexión en el bloque finally
    }
    
    return idFactura; // Retornamos el ID generado
    }

    public int insertFacturaCompra(int id_proveedor, int cantidadTotal, Date fechaCompra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getLastInsertedId() throws Exception {
        
        
        int lastId = 0;
           try {
               this.Conectar();
               // Ejecutar la consulta para obtener el último ID generado
               PreparedStatement st = this.conexion.prepareStatement("SELECT LAST_INSERT_ID()");
               ResultSet rs = st.executeQuery();

               if (rs.next()) {
                   lastId = rs.getInt(1); // Obtener el ID
               }
           } catch (Exception e) {
               throw e;
           } finally {
               this.Cerrar();
           }
           return lastId; // Retornar el último ID    
           }
    
     // Método para actualizar el total de la factura
    @Override
    public void actualizarTotal(int idFacturaCompra, float total, int totalCantidad) throws Exception {
         try {
        this.Conectar();
        PreparedStatement st = this.conexion.prepareStatement(
            "UPDATE facturacompra SET total = ?, cantidad = ? WHERE id_facturacompra = ?"
        );

        // Establecer parámetros
        st.setFloat(1, total);
        st.setInt(2, totalCantidad); // Establecer la cantidad total
        st.setInt(3, idFacturaCompra); // Establecer el ID de la factura

        // Ejecutar la actualización
        st.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace(); // Mostrar el error en la consola para depuración
        throw e; // Volver a lanzar la excepción
    } finally {
        this.Cerrar(); // Cerrar la conexión
    }
    }

    @Override
    public List<facturacompra> ReadNames() throws Exception {

         List<facturacompra> lista = new ArrayList<>();
    try {
        this.Conectar();
        PreparedStatement st = this.conexion.prepareStatement(
            "SELECT facturacompra.id_facturacompra, proveedor.nombre_proveedor, facturacompra.cantidad, facturacompra.fecha, facturacompra.total " +
            "FROM facturacompra " +           
            "JOIN proveedor ON facturacompra.id_proveedor = proveedor.id_proveedor;"
        );

        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            facturacompra facturacompra = new facturacompra();
            facturacompra.setId_facturacompra(rs.getInt("id_facturacompra"));    
            facturacompra.setNombre_proveedor(rs.getString("nombre_proveedor"));      
            facturacompra.setCantidad(rs.getInt("cantidad"));
            facturacompra.setFecha(rs.getDate("fecha"));
            facturacompra.setTotal(rs.getFloat("total"));
            lista.add(facturacompra);
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
}
