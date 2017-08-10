/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.clase3;
import java.util.*;

/**
 *
 * @author lINA VELASQUEZ
 * @version 1
 * @since 09/08/20|7
 * Ejercicio de especificaconn de funciones en Java
 */
public class EjercicioClase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner flujoEnt = new Scanner (System.in);
        // declarar varibles
        
        String nombre = null;
        int numHoras = 0;
        double valorHora = 0;
        double valorPagar = 0;
        
        // lectyra de datos
        
        System.out.println("Nombre:");
        nombre = flujoEnt.next();
        
        System.out.println("Horas Trabajadas:");
        numHoras = flujoEnt.nextInt();
        
        System.out.println("Valor Hora: ");
        valorHora = flujoEnt.nextDouble();
        
        // nvocacion de la funcion
        
        valorPagar = CalcularSalario ( numHoras, valorHora );
        System.out.println("Nombre" + nombre + "pago " + valorPagar);
        
    }
    public static double CalcularSalario ( int numHoras,double valorHora ){
        double totalSalario = 0;
        double extra = 0;
        if (numHoras  > 40 && numHoras < 8 ){
         
          numHoras = numHoras - 40;
          extra = numHoras * valorHora;
          extra *=2 ;
          totalSalario = totalSalario * 40 ;
          
            
        }
        else if ( numHoras > 48 ){
            numHoras = numHoras - 40;
          extra = numHoras * valorHora;
          extra *=3 ;
          totalSalario = totalSalario * 40 ;
            
        }
        
        else {
                        totalSalario =   valorHora * numHoras  ;

        }
        return totalSalario;
    }
}
