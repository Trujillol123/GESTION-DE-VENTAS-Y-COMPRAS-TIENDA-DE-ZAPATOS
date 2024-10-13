/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.zapatocolor_talla;

/**
 *
 * @author cland
 */
public interface DAOZapatoColorTalla {
    
    public void create(zapatocolor_talla zapatocolor_talla)throws Exception;

    public List<zapatocolor_talla> read()throws Exception;
    
    public zapatocolor_talla readById(int id)throws Exception;
    
}
