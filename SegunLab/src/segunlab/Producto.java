/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunlab;

/**
 *
 * @author MARIAJOSE
 */
public class Producto {
    private String nombreProd;
    private int cantidad;

    public Producto(String nombreProd, int cantidad) {
        this.nombreProd = nombreProd;
        this.cantidad = cantidad;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
