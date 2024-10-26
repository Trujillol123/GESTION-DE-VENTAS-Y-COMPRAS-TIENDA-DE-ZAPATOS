/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cland
 */
public class comprazapato {
    
    
    
  
    private int id_comprazapato;
    private int id_zapato;
    private int id_facturacompra;
    private int id_color;
    private int id_talla;
    private int cantidad;

    public comprazapato(int ultimoIdComprazapato, int idZapato, int idFacturaCompra, int idColor, int idTalla, int cantidad1) {
        this.id_zapato = idZapato;
        this.id_facturacompra = idFacturaCompra;
        this.id_color = idColor;
        this.id_talla = idTalla;
        this.cantidad = cantidad1;
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
    
    
}
