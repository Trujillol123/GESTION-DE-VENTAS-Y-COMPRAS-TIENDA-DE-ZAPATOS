/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.zapato_color;

/**
 *
 * @author cland
 */
public interface DAOZapatoColor {
     public void create(zapato_color zapato_color) throws Exception;

    public List<zapato_color> read()throws Exception;
    
    public zapato_color readById(int id)throws Exception;

}