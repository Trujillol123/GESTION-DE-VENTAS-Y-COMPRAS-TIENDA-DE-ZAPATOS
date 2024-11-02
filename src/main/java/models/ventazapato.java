/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cland
 */
public class ventazapato {
    
    private int id_detalleventa;
    private int id_facturaventa;
    private int id_zapato;
    private int cantidad;
    private float precio_unitario;
    private int id_color;
    private int id_talla;
    private String nombre_color;
    private String numero_talla;
    private String descripcion;
    private float Precio_venta;
    private float Subtotal;

    public float getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(float Subtotal) {
        this.Subtotal = Subtotal;
    }

    public float getPrecio_venta() {
        return Precio_venta;
    }

    public void setPrecio_venta(float Precio_venta) {
        this.Precio_venta = Precio_venta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
    
    // Constructor
    public ventazapato(int idZapato, int idFacturaVenta, int cantidad, int idColor, int idTalla) {
        this.id_zapato = idZapato;
        this.id_facturaventa = idFacturaVenta;
        this.cantidad = cantidad;
        this.id_color = idColor; // Inicializa el color
        this.id_talla = idTalla; // Inicializa la talla
    }

    public ventazapato() {
    }
    
    
    public int getId_color() {
        return id_color;
    }

    public void setId_color(int id_color) {
        this.id_color = id_color;
    }

    public int getId_talla() {
        return id_talla;
    }

    public void setId_talla(int id_talla) {
        this.id_talla = id_talla;
    }

    public String getNombre_color() {
        return nombre_color;
    }

    public void setNombre_color(String nombre_color) {
        this.nombre_color = nombre_color;
    }

    public String getNumero_talla() {
        return numero_talla;
    }

    public void setNumero_talla(String numero_talla) {
        this.numero_talla = numero_talla;
    }

    public ventazapato(int idZapato, int idFacturaVenta, int cantidad) {
        
        this.id_zapato = idZapato;
        this.id_facturaventa = idFacturaVenta;
        this.cantidad = cantidad;

    }

    public int getId_detalleventa() {
        return id_detalleventa;
    }

    public void setId_detalleventa(int id_detalleventa) {
        this.id_detalleventa = id_detalleventa;
    }

    public int getId_facturaventa() {
        return id_facturaventa;
    }

    public void setId_facturaventa(int id_facturaventa) {
        this.id_facturaventa = id_facturaventa;
    }

    public int getId_zapato() {
        return id_zapato;
    }

    public void setId_zapato(int id_zapato) {
        this.id_zapato = id_zapato;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }
    
    
}
