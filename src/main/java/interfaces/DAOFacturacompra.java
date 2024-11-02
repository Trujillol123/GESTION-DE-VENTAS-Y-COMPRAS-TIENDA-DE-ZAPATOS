 
    package interfaces;

import java.sql.Date;
    import java.util.List;
    import models.facturacompra;
import models.zapato;

    /**
     *
     * @author cland
     */
    public interface DAOFacturacompra {

        
        public int create(facturacompra factura)throws Exception;
        
        public List<facturacompra> ReadNames() throws Exception;
        
        public int getLastInsertedId() throws Exception ;     
        
        public void actualizarTotal(int idFacturaCompra, float total, int totalCantidad) throws Exception ;
       
        public List<facturacompra> buscarFactura(String query) throws Exception; 
        
        public List<facturacompra> getAllFacturas() throws Exception ;
        
        public List<facturacompra> buscarFacturaPorFechas(Date fechaInicio, Date fechaFin) throws Exception;
    }
