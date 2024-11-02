/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author cland
 */
public class VentasDelDia {
    
    
    
    private int totalZapatos;
    private float totalVentas;

    public VentasDelDia(int totalZapatos, float totalVentas) {
        this.totalZapatos = totalZapatos;
        this.totalVentas = totalVentas;
    }

    public int getTotalZapatos() {
        return totalZapatos;
    }

    public float getTotalVentas() {
        return totalVentas;
    }
}
    

