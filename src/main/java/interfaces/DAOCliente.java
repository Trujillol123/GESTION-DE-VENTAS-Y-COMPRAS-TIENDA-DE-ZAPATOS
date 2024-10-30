
package interfaces;

import java.util.List;
import models.cliente;




public interface DAOCliente {
    
    // metodo para crear un nuevo cliente
    public void create(cliente cliente) throws Exception;

    // metodo para obtener una lista de todos los clientes
    public List<cliente> read() throws Exception;

    public void delete(int id_cliente) throws Exception;
    
    public cliente getclientebyid (int id_cliente) throws Exception;
    
    public List<cliente> getAllClientes () throws Exception;
    
}
