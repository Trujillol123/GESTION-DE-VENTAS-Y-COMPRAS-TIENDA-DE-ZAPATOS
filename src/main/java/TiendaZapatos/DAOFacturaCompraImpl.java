/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaZapatos;

import interfaces.DAOFacturacompra;
import java.sql.PreparedStatement;
import java.util.List;
import models.facturacompra;

/**
 *
 * @author cland
 */
public class DAOFacturaCompraImpl extends DataBase.Database implements DAOFacturacompra{

    @Override
    public void create(facturacompra facturacompra) throws Exception {

    try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO facturacompra (id_proveedor, cantidad, fecha) VALUES (?, ?, ? )");
        
        st.setInt(1, facturacompra.getId_proveedor()); // Asumiendo que id_marca es un entero    
        st.setInt(2, facturacompra.getCantidad());

        // Aquí ya tienes un objeto java.util.Date en el cliente, lo conviertes directamente a java.sql.Date
        java.util.Date fecha = facturacompra.getFecha();
        if (fecha != null) {
            java.sql.Date sqlDate = new java.sql.Date(fecha.getTime()); // Convertir util.Date a sql.Date
            st.setDate(3, sqlDate); // Establecer la fecha en el PreparedStatement
        } else {
            st.setNull(3, java.sql.Types.DATE); // Manejo si no se proporciona fecha
        }
            
        

        st.executeUpdate();
            
                    
        } catch (Exception e) {
            
           throw  e;
        }   finally {
            
            this.Cerrar();
          
    }    }

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
    
}
