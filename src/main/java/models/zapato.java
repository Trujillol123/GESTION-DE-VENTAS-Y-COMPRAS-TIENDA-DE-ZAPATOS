/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cland
 */
public class zapato {
    
    private int id_zapato;
    private int id_categoria;
    private int id_marca;
    private int id_proveedor;
    private int id_talla;
    private String numero_talla;
    private String nombre_categoria;
    private float precio_venta;
    private float precio_compra;
    private int id_color;
    private String nombre_color;
    private int cantidad;
    private String descripcion;
    private String nombre_marca;
    private String nombre_proveedor;
  

    public zapato(int id_zapato, String descripcion) {
        this.id_zapato = id_zapato;
        this.descripcion = descripcion;
    }

    public int getId_talla() {
        return id_talla;
    }

    public int getId_color() {
        return id_color;
    }

    public void setId_color(int id_color) {
        this.id_color = id_color;
    }

    public String getNombre_color() {
        return nombre_color;
    }

    public void setNombre_color(String nombre_color) {
        this.nombre_color = nombre_color;
    }

    public void setId_talla(int id_talla) {
        this.id_talla = id_talla;
    }

    public String getNumero_talla() {
        return numero_talla;
    }

    public void setNumero_talla(String numero_talla) {
        this.numero_talla = numero_talla;
    }
  

    public zapato(int idZapato, float precio_compra) {
        this.id_zapato = idZapato;
        this.precio_compra = precio_compra;
    }

    public zapato(int idZapato, int idProveedor, String descripcion, float precio_compra) {
        this.id_zapato = id_zapato;
        this.id_proveedor = id_proveedor;
        this.descripcion = descripcion;
        this.precio_compra = precio_compra;
    }
   
    
    
    
    
    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public float getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }
  
    
     @Override
    public String toString() {
        return descripcion; 
    }
    
    
    
     public zapato(int id_zapato, int id_proveedor, String descripcion) {
        this.id_zapato = id_zapato;
        this.id_proveedor = id_proveedor;
        this.descripcion = descripcion;
    }
    
    
 
     public zapato() {
      
    }
    
 

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
        
}   
     public int getid_proveedor() {
        return id_proveedor;
    }    

    public int getId_zapato() {
        return id_zapato;
    }

    public void setId_zapato(int id_zapato) {
        this.id_zapato = id_zapato;
    }

    public int getId_categoria(int id_categoria) {
        return id_categoria;
    }
    
    public int getId_categoria() {
        return id_categoria;
    }
    
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public float getPrecio() {
        return precio_compra;
    }

    public void setPrecio(float precio) {
        this.precio_compra = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public zapato(String descripcion, float precio_compra) {
        this.descripcion = descripcion;
        this.precio_compra = precio_compra;
    }

    
   
}
