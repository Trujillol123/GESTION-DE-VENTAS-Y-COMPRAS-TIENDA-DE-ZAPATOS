/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.categoria;

/**
 *
 * @author cland
 */
public interface DAOCategoria {
    

    // Método para obtener una lista de todos los colores disponibles
    public List<categoria> getallCategorias()throws Exception;
   
    
}
