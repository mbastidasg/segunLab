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
public class Nomina {
   
    private Empleado[] empleado;
    private double salario;
    private double horasTotales;
    

    public Nomina( double salario, double horasTotales) {
        this.empleado = new Empleado[7];
        this.salario = salario;
        this.horasTotales= horasTotales;
       
    }

    public double getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(double horasTotales) {
        this.horasTotales = horasTotales;
    }
    
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public double recargoFestivo (double salario,  double aux){
       aux = (this.salario/30) * 0.75  ;
        
       return aux;
    }
    
           

    
    public double calcularSalario ( String nombre1) { 
        double aux2 = 0.0, horasT = 0.0, Recargo= 0.0;
        for (int j = 0; j < 7; j++) {
            if (this.empleado[j].getNombre().equals(nombre1)){
                
                horasT = this.empleado[j].getHorasTrabajadas() ;
                 Recargo = this.empleado[j].getFestivosTrabajados();
                 
                aux2 = (this.salario * horasT / this.horasTotales) + (this.recargoFestivo(salario,  aux2) * Recargo);
                System.out.println(aux2);
   }else{
                System.out.println("El empleado no se encuentra registrado");}
            
            }   return 0;
            
}
    
     
    
}
