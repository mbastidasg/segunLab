
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
    Producto[] productos;
    Proveedor [] proveedores;
    FechaHora fecha1;
   
    private int cantidad1;
    

    
    

    public int getCantidad1() {
        return cantidad1;
    }

    public void setCantidad1(int cantidad1) {
        this.cantidad1 = cantidad1;
    }
    
    public void agotado (){
        for (int i = 0; i < cantidad1; i++) {
            if (this.productos[i].getCantidad() <= 0){
                System.out.println("El producto" + this.productos[i].getNombreProd() + "esta agotado");
            } else {
                
            }
        }
    }
    
    
    public void masVendido() {
        int cantidadPro = 0, indice = 0;
        for (int y = 0; y < cantidad1; y++) {
            if (this.productos[y].getCantidad() > cantidadPro) {
                cantidadPro = this.productos[y].getCantidad();
                indice = y;
            }
        }
    }
        public void proxVencerp ( ){
            for (int y = 0; y < cantidad1; y++) {
            String fechaN = this.productos[y].getFecha();
         
                 float fechaAct, fechaNN;
         fechaNN  =Float.parseFloat(fechaN);
         
         String FechaAct = fecha1.Fecha();
         fechaAct = Float.parseFloat(FechaAct);
         for (int h =0; h< cantidad1; h++){
         if ((fechaAct-fechaNN )< 1){
             System.out.println("El producto vencera en 1 dia" + productos [y].getNombreProd()); 
         }
         }
     }
            
            
        }
            
        public void facturaVencer (){
        
        for (int i = 0; i < 20 ; i++) {
            float fecha2;
                  String aux1  = this.proveedores[i].getPlazo();
             fecha2 = Float.parseFloat(aux1);;
             float fu;
             String fd = fecha1.Fecha();
             fu = Float.parseFloat(fd);
             for (int h =0; h< 20; h++){
         if ((fu-fecha2 )< 1){
             System.out.println("la fecha limite vencera en un dia" + proveedores[h].getNombreProveedor()); 
         }
          }  
        }
    }
        
        public void AgregarP ( int numP, String nombre, int cantidad, String fecha, double precio){
       
            productos [numP] = new Producto ( nombre, cantidad, fecha, precio);
            System.out.println("agregado con exito");
        }
        
       public void AgregarPv (int numPv, String nombreProveedor, double deuda, String plazo, boolean cancelado){
           
           proveedores [numPv] = new Proveedor (nombreProveedor, deuda, plazo,cancelado);
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
    
}
