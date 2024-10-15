/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.cliente;

/**
 *
 * @author cland
 */
public interface DAOCliente {
    
    // Método para crear un nuevo cliente
    public void create(cliente cliente) throws Exception;

    // Método para obtener una lista de todos los clientes
    public List<cliente> read() throws Exception;

    // Método para obtener un cliente específico por su ID
    public cliente readById(int id);

    // Método para actualizar los datos de un cliente
    public void update(cliente cliente);

    public void delete(int id_cliente) throws Exception;
    
    public cliente getclientebyid (int id_cliente) throws Exception;
}
