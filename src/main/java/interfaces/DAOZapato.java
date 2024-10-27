/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.zapato;

/**
 *
 * @author cland
 */
public interface DAOZapato {
      
    public int obtenerIdPorNombre(String nombreZapato) throws Exception ;
    
    public void create(zapato zapato)throws Exception;
    
    public List<zapato> read()throws Exception;
    
    public zapato readById(int id_zapato)throws Exception;  
   
    public void delete(int id)throws Exception;
    
    public  List<zapato> ReadNames() throws Exception;
    
    public List<zapato> getallZapatos () throws Exception;

    public void actualizarCantidadZapato(int idZapato, int cantidadComprada) throws Exception;    

    public float getPrecioCompraPorZapato(int idZapato) throws Exception;
    
    public List<zapato> buscarZapato (String query) throws Exception; 
     
}
