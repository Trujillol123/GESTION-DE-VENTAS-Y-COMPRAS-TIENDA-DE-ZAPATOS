/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cland
 */
public class talla {
    private int id_talla;
    private String numero_talla;
    
    
    // Constructor que inicializa los atributos
    public talla(int id_talla, String numero_talla) {
        this.id_talla = id_talla;
        this.numero_talla = numero_talla; // Inicializar el nombre de la marca
    }
    @Override
    public String toString() {
        return numero_talla; 
    }
    public int getId_talla() {
        return id_talla;
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
}
