/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.ventazapato;

/**
 *
 * @author cland
 */
public interface DAODetalleVenta {
    

    // Método para registrar
    public void create(ventazapato compraZapato)throws Exception;

    // Método para obtener una lista 
    public List<ventazapato> read()throws Exception;
    
    // Método para obtener  por su ID
    public ventazapato readById(int id)throws Exception;
    
     public void actualizarCantidadZapatoColor(int idZapato, int idColor, int cantidad) throws Exception ;
     
     public List<ventazapato> getDetallesPorFactura(int idFacturaVenta) throws Exception;
     
}
