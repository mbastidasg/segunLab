
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunlab;
import java.util.*;
/**
 *
 * @author MARIAJOSE
 */
public class Main {
        
    public static void main(String[] args) {
    
        
         int n= 30;
     float Historial[][] = new float [n][4]; 
     
     
        Nomina nomina = new Nomina(700000.0, 192);
       Inventario inven = new Inventario();
       
        
        Scanner in = new Scanner(System.in);
        int opcion = 0, continuar =1;
                int ju = 0, ja =0, ji= 0;
        
        while(continuar == 1){
            System.out.println("Preione 1 para agreagar empleado.\n" + "Presione 2 para sacar nomina"+ "Presione 3 para agregar producot\n"+"Presione 4 para vender producto\n"+ "Presione 5 para agregar proveedor \n"+"Preione 6 para ver ventas, costos y gastos\n"+"Preione 7 para ver prodcutos\n"+ "Presine 8 para ver proveedores:\n");
            opcion = in.nextInt();
            
        
        
          nomina.AgregarE( ju , "lina", 106.0, 2);
       
          inven.AgregarP(ja, "vino", 6, "09.09" , 2000);
          inven.AgregarPv(ji, "PastaM", 200000, "13.09" , false);
          
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del empleado");
            String  nombre = in.next();
            System.out.println("Numero de horas trabajadas ");
            double horasT = in.nextDouble();
            System.out.println("Festivos trabajados ");
            int festivosTrabajados= in.nextInt();
            ju++;
            nomina.AgregarE(ju, nombre, horasT,festivosTrabajados );
            
            break;
                case 2:
                    
                    System.out.println("ingrese el nombre del empleado");
            String nombre1 = in.next();
            System.out.println("El monto a pagar a " + nombre1 + " es de ");
            nomina.calcularSalario(  nombre1);
            
            
                case 3:
                    System.out.println("Ingrese el nombre del producto");
            String  nombreP = in.next();
            System.out.println("Cantidad de unidades del productos: ");
            int cantidad = in.nextInt();
            System.out.println("Fecha de vencimiento (dia.mes) (con el punto): ");
            String FechaV = in.next();
            System.out.println("Precio por unidad de compra:");
            double precioI = in.nextInt();
                    System.out.println(" Tipo de producto : (supermercado o licor)");
                    String tipo = in.next();
            ja++;
            inven.AgregarP(ja, nombreP, cantidad, FechaV , precioI);
            
            break;
                case 4:
                   System.out.println("Ingrese el nombre del producto a vender:");
                    String nombrePr = in.next();
                    System.out.println("Ingrese la cantidad de unidades vendidas de este producto:");
                    int cuantos = in.nextInt();
                    for (int y = 0; y< inven.getCantidad1(); y++){
                        if (inven.productos[y].getNombreProd()==nombrePr){
                            System.out.println("El precio de su compra es: " + inven.productos[y].vender(cuantos));
                        }
                    }
                    inven.proxVencerp();
                    inven.facturaVencer();
                    break;
                case 5:
                    
                    System.out.println("Ingrese el nombre del proveedor");
            String  nombrePV = in.next();
            System.out.println("Precio por unidad de compra:");
            double precioPV = in.nextInt();
            System.out.println("Fecha de vencimiento de la factura (dia.mes) (con el punto): ");
            String FechaPV = in.next();
            System.out.println("Si la compra se cancelo presione 1\n:" + "Si la compra NO cancelo presione 2\n:");
            int aux = in.nextInt();
            boolean cancelado = false;
            if (aux == 2){
                cancelado = false;}
            else {
                cancelado = true;
            }
            
                   
            ji++;
            inven.AgregarPv(ji, nombrePV, precioPV, FechaPV, cancelado);
            inven.facturaVencer();
                    
                case 6:
// ver Historial 
//////                for( int f= 0; f < n; f++){
//                    for (int j= 0; j < 4; j++ ){
//                        Historial [f][j]= 
//                    }
//                } 
                 break;
                case 7:
                    for ( int fd= 0; fd < ja; fd++){
                        System.out.println("Nombre:\n "+ inven.productos[fd].getNombreProd() + "fecha de vencimiento: \n"+ inven.productos[fd].getFecha() + "Discponible:\n"  + inven.productos[fd].getCantidad()+ "Precio Unidad:\n"+ inven.productos[fd].getPrecio()); 
                    }
                    break;
                case 8:
                    for ( int fd= 0; fd < ji; fd++){
                        System.out.println("Nombre: \n" + inven.proveedores[fd].getNombreProveedor() + "Fecha de pago:\n" + inven.proveedores[fd].getPlazo()+ "Deuda " + inven.proveedores[fd].getDeuda() + "cancelado:"+ inven.proveedores[fd].isCalceldado());
                    }
                    break;
                
            
            
            }
        
                      
            
            
    }
    }
}
