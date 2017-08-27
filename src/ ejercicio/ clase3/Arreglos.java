/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase3;
import java.util.*;

/**
 *
 * @author Lina Velasquez
 */


public class Arreglos {
    
public static void main(String[] args) {
        // TODO code application logic here
        Scanner flujoEnt = new Scanner (System.in);
        // declarar varibles
        
       double Patrimonio;
       double [][] Matriz = new double [10] [6] ;
        
        
       
       double RentaLiquida = 0;
       
       int Nombre, NumCred ;
       double ValorPagar, ValorMatricula;
    int ka = 0;
      while ( ka < 10 ) {
                
        
          
          
        System.out.println("Codigo del estudiante:");
        Nombre = flujoEnt.nextInt();
          
        Matriz [ ka ] [ 0 ] = Nombre;
        
        System.out.println("Numero de creditos a cursar:");
        NumCred = flujoEnt.nextInt();
        
        Matriz [ ka ] [ 3 ] = NumCred;
        
        System.out.println("Patrimonio:");
        Patrimonio = flujoEnt.nextDouble();
        
        Matriz [ ka ] [ 2 ] = Patrimonio;
       
        System.out.println("Renta Liquida: ");
        RentaLiquida = flujoEnt.nextDouble();
        
        Matriz [ ka  ] [ 1 ] = RentaLiquida;
        
        ValorPagar = CalcularCred ( Patrimonio, RentaLiquida );
        System.out.println("Codigo: " + Nombre + " Pago:  " + ValorPagar);
        
        Matriz [ ka ] [ 4 ] = ValorPagar ;
        
        ValorMatricula = CalcularMatricula (ValorPagar, NumCred); 
        System.out.println ("Codigo: " + Nombre + " Valor Matricula: " + ValorMatricula ); 
        
        Matriz [ ka ] [ 5 ] = ValorMatricula ;
        
        for ( int i = 0 ; i < 10 ; i++ ){
           
            for ( int j = 0; j < 6; j ++){
                 System.out.println( i + "," + j + "[" + Matriz [i] [j] + "]");
            } 
        }
        
        int ke = 0;
         System.out.println("Si desea inscribir otro estudiante presione ´2 ´, para salir presione ´1 ´ : ");
        ke = flujoEnt.nextInt();
        
        if (ke == 2){
            ka  ++;
            
        }
        else {
            System.out.println("Gracias.");
            ka = 15;
        }
            
        }
        
        
 } 
   public static double CalcularCred (double Patrimonio, double RentaLiquida ){
   double ValorCredito ;
       if (RentaLiquida < 25000 && Patrimonio < 100000){
      
           ValorCredito = 130;
           return ValorCredito ;
       }
        
        else if ( RentaLiquida > 25000 && RentaLiquida < 30000 && Patrimonio > 100000 && Patrimonio < 150000) {
        
            ValorCredito = 200;
            return ValorCredito ;
          }
       
        else {
             ValorCredito = 280;
            return ValorCredito ;
        }
     
   }
   
    public static double CalcularMatricula (double ValorCredito, int NumCred ){
        // VARIABLE TOTAL COSTO DE TODOS LOS CREDITOS 
        double VALOR2;
              VALOR2  = ValorCredito * NumCred ;
        return VALOR2;
        
    }
}
