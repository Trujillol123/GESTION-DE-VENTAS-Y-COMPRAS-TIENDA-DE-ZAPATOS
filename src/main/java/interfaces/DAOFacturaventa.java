/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import models.facturacompra;
import models.facturaventa;

/**
 *
 * @author cland
 */
public interface DAOFacturaventa {

    public int create(facturaventa facturaventa)throws Exception;

    public List<facturaventa> read()throws Exception;

    public facturaventa readById(int id)throws Exception;

    public void update(facturaventa facturaventa)throws Exception;

    public void delete(int id)throws Exception;
    
    public void actualizarTotal(int idFacturaVenta, float cantidad_pagada, int totalCantidad) throws Exception ;
     
    public List<facturaventa> ReadNames() throws Exception; 
     
    public List<facturaventa> buscarVenta (String query) throws Exception;
     
    public Map<Date, Float> getVentasPorFecha() throws Exception;
     
    public List<facturaventa> buscarVentaPorFechas(Date fechaInicio, Date fechaFin) throws Exception;
     
    public Map<String, Object> obtenerVentasDelDia() throws Exception;
     
    public float obtenerVentasDelMes() throws Exception;
    
    public Map<String, Integer> obtenerProductoMasVendidoDelMes(int mes, int año) throws Exception;
     
}
