/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import DataBase.Database;
import interfaces.DAOComprazapato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.comprazapato;

public class DAOCompraZapatoImpl extends Database implements DAOComprazapato {

    @Override
    public void create(comprazapato compraZapato) throws Exception {

   
    try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO comprazapato ( id_zapato, id_facturacompra, id_color, id_talla, cantidad) VALUES ( ?, ?, ?, ?, ?)");
        
            
        
        st.setInt(1, compraZapato.getId_zapato());
        st.setInt(2, compraZapato.getId_facturacompra()); 
        st.setInt(3, compraZapato.getId_color());
        st.setInt(4, compraZapato.getId_talla());
        st.setInt(5, compraZapato.getCantidad());
        
        st.executeUpdate();
            
                    
        } catch (Exception e) {
            
           throw  e;
        }   finally {
            
            this.Cerrar();
          
    }
    }
    
    @Override
    public int obtenerUltimoId() throws Exception {
          int ultimoId = 0;

    try {
        this.Conectar();  // Asegúrate de que este método establece la conexión correctamente
        PreparedStatement st = this.conexion.prepareStatement("SELECT MAX(id_comprazapato) AS max_id FROM comprazapato");
        ResultSet rs = st.executeQuery();  // Ejecutar la consulta

        if (rs.next()) {  // Verifica si hay resultados
            ultimoId = rs.getInt("max_id");  // Obtener el ID máximo
        }
        
        rs.close();  // Cerrar el ResultSet
        st.close();  // Cerrar el PreparedStatement
    } catch (SQLException e) {
        e.printStackTrace();
        throw new Exception("Error al obtener el último ID de comprazapato: " + e.getMessage());
    } finally {
        this.Cerrar();// Asegúrate de cerrar la conexión
    }

    return ultimoId;  // Retornar el último ID
}

    public void create(int ultimoIdComprazapato, comprazapato compraZapato) throws Exception{

   
    try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO comprazapato ( id_zapato, id_facturacompra, id_color, id_talla, cantidad) VALUES (?, ?, ?, ?, ?)");
        
            
        st.setInt(1, compraZapato.getId_zapato());
        st.setInt(2, compraZapato.getId_facturacompra()); 
        st.setInt(3, compraZapato.getId_color());
        st.setInt(4, compraZapato.getId_talla());
        st.setInt(5, compraZapato.getCantidad());
        
        st.executeUpdate();
            
                    
        } catch (Exception e) {
            
           throw  e;
        }   finally {
            
            this.Cerrar();
          
    }}   

    @Override
    public List<comprazapato> getDetallesPorFactura(int idFacturaCompra) throws Exception{
          List<comprazapato> detalles = new ArrayList<>();

    try {
        this.Conectar();
        String query = "SELECT c.id_zapato, z.descripcion, c.cantidad, col.nombre_color, t.numero_talla, "
                     + "z.precio_compra, f.fecha "
                     + "FROM comprazapato c "
                     + "JOIN zapato z ON c.id_zapato = z.id_zapato "
                     + "JOIN facturacompra f ON c.id_facturacompra = f.id_facturacompra "
                     + "JOIN colores col ON c.id_color = col.id_color "
                     + "JOIN talla t ON c.id_talla = t.id_talla "
                     + "WHERE c.id_facturacompra = ?";
        
        PreparedStatement st = this.conexion.prepareStatement(query);
        st.setInt(1, idFacturaCompra);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            comprazapato detalle = new comprazapato();
            
            detalle.setNombre_zapato(rs.getString("descripcion"));  
            detalle.setCantidad(rs.getInt("cantidad"));             
            detalle.setNombre_color(rs.getString("nombre_color"));        
            detalle.setNumero_talla(rs.getString("numero_talla"));  
            detalle.setFecha(rs.getDate("fecha"));           
            detalle.setPrecio_compra(rs.getFloat("precio_compra")); 
            
            // Calcular el subtotal
            float subtotal = detalle.getPrecio_compra() * detalle.getCantidad();
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
