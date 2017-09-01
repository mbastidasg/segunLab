/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendita;

/**
 *
 * @author Maicol Velasquez
 */
public class Operaciones {
    
    private int cantidad;
    Producto[] productos;
    
    private int vendido;
    
    
    public Operaciones (int cantidad){
       
        this.cantidad = cantidad;
      
     Producto [ ] productos = new Producto [4];
    
}

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



// no entendi la primera

public Producto Pedido ( ){
    
    Producto productos = null;
    for (int h= 0; h < 4 ; h++){
        if (this.productos[h].getDisponible()== this.productos[h].getMin()){
            System.out.println(" AVISO :\n" + "Pedir pedido urgente, ha legado a la cantidad minima de:" + productos);
                     }
    } 
    return productos;    
}

public Producto Estadisticas (  ){
    int indice = 0, aux= 0;
    Producto productos = null;
    for (int k = 0; k < 4 ; k++){
        if (this.productos[k].getDisponible()!= cantidad){
            aux= this.productos[k].getDisponible()- cantidad;
            
        } 

// menos disponiblidad es el mas vendido. cada vez que se venda se resta
   // a disponiblidad 
}


}
}
