/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Date;

/**
 *
 * @author cland
 */
public class facturaventa {
    
    
    private int id_pago;
    private int id_cliente;
    private int id_metodopago;
    private String nombre_metodopago;
    private Date fecha;
    private float cantidad_pagada;
    private int id_facturaventa;
    private String nombre_cliente;
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public facturaventa() {
    }

    
 
    
    
    
    
    public int getId_facturaventa() {
        return id_facturaventa;
    }

    public void setId_facturaventa(int id_facturaventa) {
        this.id_facturaventa = id_facturaventa;
    }
    
    // Constructor
    public facturaventa(int id_cliente, float cantidad_pagada,int id_metodopago ,Date fecha) {
        this.id_cliente = id_cliente;
        this.cantidad_pagada = cantidad_pagada;
        this.id_metodopago = id_metodopago;
        this.fecha = fecha;
    }
    

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public int getId_metodopago() {
        return id_metodopago;
    }

    public void setId_metodopago(int id_metodopago) {
        this.id_metodopago = id_metodopago;
    }

    public String getNombre_metodopago() {
        return nombre_metodopago;
    }

    public void setNombre_metodopago(String nombre_metodopago) {
        this.nombre_metodopago = nombre_metodopago;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

  

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getCantidad_pagada() {
        return cantidad_pagada;
    }

    public void setCantidad_Pagada(float cantidad_pagada) {
        this.cantidad_pagada = cantidad_pagada;
    }
    
    
}
