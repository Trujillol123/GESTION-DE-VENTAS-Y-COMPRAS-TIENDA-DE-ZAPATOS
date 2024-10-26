/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.comprazapato;

/**
 *
 * @author cland
 */
public interface DAOComprazapato {
    
    // Método para registrar una nueva compra de zapato
    public void create(comprazapato compraZapato)throws Exception;

    // Método para obtener una lista de todas las compras de zapatos
    public List<comprazapato> read()throws Exception;
    
    // Método para obtener una compra específica por su ID
    public int obtenerUltimoId () throws Exception;

    
    public List<comprazapato> getDetallesPorFactura(int idFacturaCompra)throws Exception;
    
    public comprazapato readById(int id)throws Exception;
}
