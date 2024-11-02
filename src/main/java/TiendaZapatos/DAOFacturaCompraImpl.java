
package TiendaZapatos;

import interfaces.DAOFacturacompra;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.facturacompra;



    public class DAOFacturaCompraImpl extends DataBase.Database implements DAOFacturacompra{

  

        @Override
        public int create (facturacompra factura) throws Exception {

             int idFactura = 0;

        try {

            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                "INSERT INTO facturacompra (id_proveedor, cantidad, fecha, total) VALUES (?, ?, ?, ?)",
                PreparedStatement.RETURN_GENERATED_KEYS // Permite obtener el ID generado
            );


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
        public int getLastInsertedId() throws Exception {


            int lastId = 0;
               try {
                   this.Conectar();
                   // consulta para obtener el ultimo id generado
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
               return lastId; // Retornar el utimo od
               }


        @Override
        public void actualizarTotal(int idFacturaCompra, float total, int totalCantidad) throws Exception {
             try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement(
                "UPDATE facturacompra SET total = ?, cantidad = ? WHERE id_facturacompra = ?"
            );


            st.setFloat(1, total);
            st.setInt(2, totalCantidad);
            st.setInt(3, idFacturaCompra); 


            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(); 
            throw e;
        } finally {
            this.Cerrar(); 
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

        @Override
        public List<facturacompra> getAllFacturas() throws Exception {
           List<facturacompra> facturas = new ArrayList<>();

        try {
            this.Conectar();

            String query = "SELECT f.id_facturacompra, p.nombre_proveedor, f.cantidad, f.fecha, f.total " +
                           "FROM facturacompra f " +
                           "JOIN proveedor p ON f.id_proveedor = p.id_proveedor";

            PreparedStatement st = this.conexion.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                facturacompra factura = new facturacompra();
                factura.setId_facturacompra(rs.getInt("id_facturacompra"));

                factura.setNombre_proveedor(rs.getString("nombre_proveedor")); 
                factura.setCantidad(rs.getInt("cantidad"));
                factura.setFecha(rs.getDate("fecha"));
                factura.setTotal(rs.getFloat("total"));

                facturas.add(factura);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener las facturas: " + e.getMessage());
        } finally {
            this.Cerrar(); // Asegúrate de cerrar la conexión
        }

        return facturas;
        }


        public List<facturacompra> buscarFactura(String query) throws Exception {
         List<facturacompra> facturas = new ArrayList<>();

        try {
            this.Conectar();

            String sql = "SELECT f.id_facturacompra, p.nombre_proveedor, f.cantidad, f.fecha, f.total " +
                         "FROM facturacompra f " +
                         "JOIN proveedor p ON f.id_proveedor = p.id_proveedor " +
                         "WHERE p.nombre_proveedor LIKE ? OR f.id_facturacompra LIKE ? " +
                         "OR f.cantidad LIKE ? OR f.fecha LIKE ? OR f.total LIKE ?";

            PreparedStatement st = this.conexion.prepareStatement(sql);
            String searchPattern = "%" + query + "%"; 
            st.setString(1, searchPattern); 
            st.setString(2, searchPattern); 
            st.setString(3, searchPattern); 
            st.setString(4, searchPattern); 
            st.setString(5, searchPattern); 
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                facturacompra factura = new facturacompra();
                factura.setId_facturacompra(rs.getInt("id_facturacompra"));
                factura.setNombre_proveedor(rs.getString("nombre_proveedor"));
                factura.setCantidad(rs.getInt("cantidad"));
                factura.setFecha(rs.getDate("fecha"));
                factura.setTotal(rs.getFloat("total"));

                facturas.add(factura);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar las facturas: " + e.getMessage());
        } finally {
            this.Cerrar(); 
        }

        return facturas;
        }
        
        
        @Override
        public List<facturacompra> buscarFacturaPorFechas(Date fechaInicio, Date fechaFin) throws Exception {
            List<facturacompra> facturas = new ArrayList<>();

            try {
                this.Conectar();

                String sql = "SELECT f.id_facturacompra, p.nombre_proveedor, f.cantidad, f.fecha, f.total " +
                             "FROM facturacompra f " +
                             "JOIN proveedor p ON f.id_proveedor = p.id_proveedor " +
                             "WHERE f.fecha >= ? AND f.fecha <= ? " +
                             "ORDER BY f.fecha";

                PreparedStatement st = this.conexion.prepareStatement(sql);
                st.setDate(1, fechaInicio);
                st.setDate(2, fechaFin);

                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    facturacompra factura = new facturacompra();
                    factura.setId_facturacompra(rs.getInt("id_facturacompra"));
                    factura.setNombre_proveedor(rs.getString("nombre_proveedor"));
                    factura.setCantidad(rs.getInt("cantidad"));
                    factura.setFecha(rs.getDate("fecha"));
                    factura.setTotal(rs.getFloat("total"));

                    facturas.add(factura);
                }

                rs.close();
                st.close();
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            } finally {
                this.Cerrar();
            }

            return facturas;
        }

        
        
    }
