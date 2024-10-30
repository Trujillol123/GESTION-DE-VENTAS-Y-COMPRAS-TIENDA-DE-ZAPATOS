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
public class comprazapato {
    
    
    
  
  
    private int id_comprazapato;
    private int id_proveedor;

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }
    private int id_zapato;
    private int id_facturacompra;
    private int id_color;
    private int id_talla;
    private int cantidad;
    private String nombre_zapato;
    private float Precio_compra;
    private String nombre_color;
    private Date Fecha;
    private Double SubTotal;
    private int id_zapatocolor;

    public int getId_zapatocolor() {
        return id_zapatocolor;
    }

    public void setId_zapatocolor(int id_zapatocolor) {
        this.id_zapatocolor = id_zapatocolor;
    }

    public Double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(Double SubTotal) {
        this.SubTotal = SubTotal;
    }
    

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
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
    private String numero_talla;
    

    public float getPrecio_compra() {
        return Precio_compra;
    }

    public void setPrecio_compra(float Precio_compra) {
        this.Precio_compra = Precio_compra;
    }

    public String getNombre_zapato() {
        return nombre_zapato;
    }

    public void setNombre_zapato(String nombre_zapato) {
        this.nombre_zapato = nombre_zapato;
    }
    
    
    public comprazapato(int idZapato, int idZapatoColor, int idTalla, int cantidad){
        this.id_zapato = idZapato;
        this.id_zapatocolor = idZapatoColor;
        this.id_talla = idTalla;
        this.cantidad = cantidad;
    }

    public comprazapato(int ultimoIdComprazapato, int idZapato, int idFacturaCompra, int idColor, int idTalla, int cantidad1) {
        this.id_zapato = idZapato;
        this.id_facturacompra = idFacturaCompra;
        this.id_color = idColor;
        this.id_talla = idTalla;
        this.cantidad = cantidad1;
    }

    public comprazapato() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    // Constructor
      public comprazapato(int idZapato, int idFacturaCompra, int idColor, int idTalla, int cantidad) {
        this.id_zapato = idZapato;
        this.id_facturacompra = idFacturaCompra;
        this.id_color = idColor;
        this.id_talla = idTalla;
        this.cantidad = cantidad;
    }
    

    public int getId_comprazapato() {
        return id_comprazapato;
    }

    public void setId_comprazapato(int id_comprazapato) {
        this.id_comprazapato = id_comprazapato;
    }

    public int getId_zapato() {
        return id_zapato;
    }

    public void setId_zapato(int id_zapato) {
        this.id_zapato = id_zapato;
    }

    public int getId_facturacompra() {
        return id_facturacompra;
    }

    public void setId_facturacompra(int id_facturacompra) {
        this.id_facturacompra = id_facturacompra;
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

    public void setFecha_compra(Date date) {
        this.Fecha = Fecha;
    }

    public void setSubtotal(Float subtotal) {
        this.SubTotal = SubTotal;
    }

    
    
    
}
