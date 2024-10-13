/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.detalleventa;

/**
 *
 * @author cland
 */
public interface DAODetalleVenta {
    

    // Método para registrar
    public void create(detalleventa compraZapato)throws Exception;

    // Método para obtener una lista 
    public List<detalleventa> read()throws Exception;
    
    // Método para obtener  por su ID
    public detalleventa readById(int id)throws Exception;
}
