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
     public int create(zapato_color zapato_color) throws Exception;

    public List<zapato_color> read()throws Exception;
    
    public zapato_color readById(int id)throws Exception;

    public int obtenerIdporcantidad (int cantidad) throws Exception ;
    
    public int obtenerIdZapatoColor(int idZapato, int idColor) throws Exception ;
    
     public List<zapato_color> obtenerColoresZapato(int idZapato) throws Exception ;
}