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
    
        Nomina nomina = new Nomina(700000.0, 192);
       Empleado[] empleado = new Empleado[7];
        
        Scanner in = new Scanner(System.in);
        int opcion = 0, continuar =1;
        double horasT = 0.0, festivosTrabajados =0.0;
        String nombre = "", nombre1 ="";
        
       
            System.out.println("Ingrese el nombre del empleado");
            nombre = in.next();
            System.out.println("Numero de horas trabajadas ");
            horasT = in.nextDouble();
            System.out.println("Festivos trabajados ");
            festivosTrabajados= in.nextDouble();
            
            
                          
            System.out.println("ingrese el nombre del empleado");
             nombre1 = in.next();
            System.out.println("El monto a pagar a " + nombre + " es de ");
            nomina.calcularSalario(  nombre1);
            
    }

}
