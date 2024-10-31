/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cland
 */
public class zapatocolor_talla {

   
    
    private int id_zapatocolortalla;
    private int id_talla;
    private int id_zapatocolor;
    private int cantidad;
    private String numero_talla;

    
    
     @Override
    public String toString() {
        return numero_talla; 
    }
    
    
    
    public zapatocolor_talla(int idTalla, String numerotalla) {
        this.id_talla = idTalla;
        this.numero_talla = numerotalla;
    }

    public zapatocolor_talla() {
    }

    public String getNumero_talla() {
        return numero_talla;
    }

    public void setNumero_talla(String numero_talla) {
        this.numero_talla = numero_talla;
    }
    
    public int getId_zapatocolortalla() {
        return id_zapatocolortalla;
    }

    public void setId_zapatocolortalla(int id_zapatocolorTalla) {
        this.id_zapatocolortalla = id_zapatocolortalla;
    }

    public int getId_talla() {
        return id_talla;
    }

    public void setId_talla(int id_talla) {
        this.id_talla = id_talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
     public int getId_zapatocolor() {
        return id_zapatocolor;
    }

    public void setId_zapatocolor(int id_zapatocolor) {
        this.id_zapatocolor = id_zapatocolor;
    }
    
}
