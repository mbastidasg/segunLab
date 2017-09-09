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
public class Inventario {
    Producto[] producto;
    private int cantidad1;

    public Inventario( Producto producto, int cantidad1) {
        this.producto = new Producto[cantidad1];
        this.cantidad1= cantidad1++;
    }

    public int getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(int cantidad1) {
        this.cantidad1 = cantidad1;
    }
    
    public void agotado (){
        for (int i = 0; i < cantidad1; i++) {
            if (this.producto[cantidad1].getCantidad() <= 0){
                System.out.println("El producto" + this.producto[cantidad1].getNombreProd() + "esta agotado");
            } else {
                
            }
        }
    }
    
    
    public void masVendido() {
        int cantidadPro = 0, indice = 0;
        for (int y = 0; y < cantidad1; y++) {
            if (this.producto[y].getCantidad() > cantidadPro) {
                cantidadPro = this.producto[y].getCantidad();
                indice = y;
            }
        }
            
            
            
//    public void ActualizarInv(Inventario inventario, int totalVenta, int cant2) {
//        
//       
//        for (int i = 0; i < this.cantidad1; i++) {
//            int cantidad22 = this.producto[cantidad1].getCantidad();
//            System.out.println("Ingrese la cantidad vendida de" + this.producto[cantidad1].getNombreProd());
//            cantidad22 -= cant2;
//            this.producto[cantidad1].setCantidad(cantidad22);
//            
//        }
//              }
    
}}
