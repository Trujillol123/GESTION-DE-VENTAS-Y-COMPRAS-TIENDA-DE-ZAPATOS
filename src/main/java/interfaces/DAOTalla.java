/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.talla;

/**
 *
 * @author cland
 */
public interface DAOTalla {
    // Método para obtener una lista de todos los colores disponibles
    public List<talla> getallTallas ()throws Exception;
    
    // Método para obtener un color específico por su ID
    public talla readById(int id)throws Exception;
    
     public int obtenerIdPorNumero (String numero_talla) throws Exception ;

}
