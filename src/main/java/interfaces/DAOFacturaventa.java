/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import models.facturaventa;

/**
 *
 * @author cland
 */
public interface DAOFacturaventa {

    public void create(facturaventa facturaventa)throws Exception;

    public List<facturaventa> read()throws Exception;

    public facturaventa readById(int id)throws Exception;

    public void update(facturaventa facturaventa)throws Exception;

    public void delete(int id)throws Exception;
}
