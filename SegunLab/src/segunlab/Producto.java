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
    private String fecha;
    private int vendido;
    private double precio;
    private double Dinero;
    

    public Producto(String nombreProd, int cantidad, String fecha, double precio) {
        this.nombreProd = nombreProd;
        this.cantidad = cantidad;
     
        this.fecha = fecha;
        this.precio = precio;
    }

    
    
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getVendido() {
        return vendido;
    }

    public void setVendido(int vendido) {
        this.vendido = vendido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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
    
//    static double precioFijo(double precio, String tipo) {
//        double aux = 0, precioF = 0.0;
//        switch (tipo) {
//            case "licor":
//                aux = (precio * 16) / 100;
//                precioF = precio + aux;
//                break;
//            case "supermercado":
//                aux = (precio * 4) / 100;
//                precioF = precio + aux;
//                break;
//            
//            default:
//                aux = -1.0;
//                break;
//        }
//        return precioF;
//    }
    
     public double vender(int cantidad) {
        
        this.vendido += cantidad;
        this.Dinero += precio * cantidad;
        return precio * cantidad;
        
    }
    
     
     
}
