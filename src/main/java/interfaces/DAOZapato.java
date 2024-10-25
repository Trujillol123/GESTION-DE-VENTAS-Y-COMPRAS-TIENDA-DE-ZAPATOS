/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.zapato;

/**
 *
 * @author cland
 */
public interface DAOZapato {
      
    // Método para crear una nueva factura
    public void create(zapato zapato)throws Exception;

    // Método para obtener una lista de todos los clientes
    public List<zapato> read()throws Exception;

    // Método para obtener una factura por su ID
    public zapato readById(int id_zapato)throws Exception;

    // Método para actualizar los datos de una factura
    public void update(zapato zapato)throws Exception;

    // Método para eliminar una factura por su ID
    public void delete(int id)throws Exception;
    
    public  List<zapato> ReadNames() throws Exception;
    
    public List<zapato> getallZapatos () throws Exception;

   

     public float getPrecioCompraPorZapato(int idZapato) throws Exception;
     
}
