/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.proveedor;

/**
 *
 * @author cland
 */
public interface DAOProveedor {
    
    public void create(proveedor proveedor)throws Exception;

    public List<proveedor> read()throws Exception;
   
    public proveedor readById(int id)throws Exception;

    public void delete(int id)throws Exception;
    
    public List<proveedor> getAllProveedores()throws Exception;
    
}
