/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class marca {
    private int id_marca;
    private String nombre_marca; // O el nombre que uses para la marca

    // Constructor que inicializa los atributos
    public marca(int id_marca, String nombre_marca) {
        this.id_marca = id_marca;
        this.nombre_marca = nombre_marca; // Inicializar el nombre de la marca
    }

    @Override
    public String toString() {
        return nombre_marca; 
    }

    // Métodos getters y setters
    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }
}
