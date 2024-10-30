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
    
    // metodo para registrar una nueva compra de zapato
    public void create(comprazapato compraZapato)throws Exception;

   
    
    // metodo para obtener una compra específica por su ID
    public int obtenerUltimoId () throws Exception;

    
    public List<comprazapato> getDetallesPorFactura(int idFacturaCompra)throws Exception;
    
    public void actualizarCantidadZapatoColor(int idZapato, int idColor, int cantidad) throws Exception;
    
    public void actualizarCantidadZapatoColorTalla(int idZapato, int idColor, int idTalla, int cantidad) throws Exception;
}
