/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cland
 */
public class proveedor {
    
    
    private int id_proveedor;
    private int id_marca;
    private String nombre_proveedor;
    private String telefono;
    private String email;
    private String direccion;

   
    
    
    public proveedor() {
        // Constructor vacío para permitir la creación de objetos sin parámetros
    }
    

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getid_marca() {
        return id_marca;
    }

    public void setid_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
     @Override
    public String toString() {
        return nombre_proveedor; 
    }
    
     // Constructor que inicializa los atributos
    public proveedor(int id_proveedor, String nombre_proveedor) {
        this.id_proveedor = id_proveedor;
        this.nombre_proveedor = nombre_proveedor; // Inicializar el nombre de la marca
    }
    
}
