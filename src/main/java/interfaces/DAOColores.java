/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.colores;

/**
 *
 * @author cland
 */
public interface DAOColores {
       
    // Método para obtener una lista de todos los colores disponibles
    public List<colores> getallColors ()throws Exception;
    
    // Método para obtener un color específico por su ID
    public colores readById(int id)throws Exception;
    
    public int obtenerIdPorNombre(String nombre_color) throws Exception ;
}
