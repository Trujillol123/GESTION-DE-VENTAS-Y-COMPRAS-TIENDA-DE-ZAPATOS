/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cland
 */
public class colores {
    
   private int id_color;
   private String nombre_color;

      
   
   @Override
    public String toString() {
        return nombre_color;}
   
   public colores(int id_color, String nombre_color) {
        this.id_color = id_color;
        this.nombre_color = nombre_color;
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
    
}
