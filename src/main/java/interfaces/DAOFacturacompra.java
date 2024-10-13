/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.facturacompra;

/**
 *
 * @author cland
 */
public interface DAOFacturacompra {
    
    // Método para crear una nueva factura
    public void create(facturacompra facturacompra)throws Exception;

    // Método para obtener una lista de todos los clientes
    public List<facturacompra> read()throws Exception;

    // Método para obtener una factura por su ID
    public facturacompra readById(int id)throws Exception;

    // Método para actualizar los datos de una factura
    public void update(facturacompra facturacompra)throws Exception;

    // Método para eliminar una factura por su ID
    public void delete(int id)throws Exception;
    
}
