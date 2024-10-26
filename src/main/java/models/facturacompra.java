/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author cland
 */
public class facturacompra {
    private int id_facturacompra;
    private int id_proveedor;
    private int cantidad;
    private Date fecha;
    private float total ; 
    private String nombre_proveedor;

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    // Constructor
    public facturacompra(int id_proveedor, int cantidad, Date fecha) {
        this.id_proveedor = id_proveedor;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public facturacompra() {
    }

    // Getters y Setters
    public int getId_facturacompra() { return id_facturacompra; }
    public void setId_facturacompra(int id_facturacompra) { this.id_facturacompra = id_facturacompra; }

    public int getId_proveedor() { return id_proveedor; }
    public void setId_proveedor(int id_proveedor) { this.id_proveedor = id_proveedor; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
}
