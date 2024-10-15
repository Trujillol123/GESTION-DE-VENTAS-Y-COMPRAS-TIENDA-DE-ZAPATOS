/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.marca;

/**
 *
 * @author cland
 */
public interface DAOMarca {
    
    
    public List<marca> getAllMarcas()throws Exception;
    
    public marca readById(int id)throws Exception;
    
}
