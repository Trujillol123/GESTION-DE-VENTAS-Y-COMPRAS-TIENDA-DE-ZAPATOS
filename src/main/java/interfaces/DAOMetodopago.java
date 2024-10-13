/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.metodopago;

/**
 *
 * @author cland
 */
public interface DAOMetodopago {
  // Método para obtener una lista de todos los colores disponibles
    public List<metodopago> read()throws Exception;
    
    // Método para obtener un color específico por su ID
    public metodopago readById(int id)throws Exception;
}
