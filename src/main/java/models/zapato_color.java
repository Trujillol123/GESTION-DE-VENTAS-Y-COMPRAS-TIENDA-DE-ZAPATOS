/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cland
 */
public class zapato_color {
    
    private int id_zapatocolor;
    private int id_zapato;
    private int id_color;
    private int cantidad;
    private String nombre_zapato;
    private String nombreColor;
    
    
    
     @Override
    public String toString() {
        return nombreColor; 
    }
    
    public int getId_zapatocolor() {
        return id_zapatocolor;
    }

    public void setId_zapatocolor(int id_zapatocolor) {
        this.id_zapatocolor = id_zapatocolor;
    }

    public String getnombre_zapato() {
        return nombre_zapato;
    }

    public void setnombre_zapato(String nombre_zapato) {
        this.nombre_zapato = nombre_zapato;
    }

    public String getNombreColor() {
        return nombreColor;
    }

    public void setNombreColor(String nombreColor) {
        this.nombreColor = nombreColor;
    }
   

    public int getid_zapatocolor() {
        return id_zapatocolor;
    }

    public void setid_zapatocolor(int id_zapatocolor) {
        this.id_zapatocolor = id_zapatocolor;
    }

    public int getId_zapato() {
        return id_zapato;
    }

    public void setId_zapato(int id_zapato) {
        this.id_zapato = id_zapato;
    }

    public int getId_color() {
        return id_color;
    }

    public void setId_color(int id_color) {
        this.id_color = id_color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
