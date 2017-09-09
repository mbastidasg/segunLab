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
public class Empleado {
    private String nombre;
    private double horasTrabajadas;
    private double festivosTrabajados;
    

    public Empleado(String nombre,  double horasTrabajadas, double festivosTrabajados) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.festivosTrabajados = festivosTrabajados;
    }

    public double getFestivosTrabajados() {
        return festivosTrabajados;
    }

    public void setFestivosTrabajados(double festivosTrabajados) {
        this.festivosTrabajados = festivosTrabajados;
    }

    

    public String getNombre() {
        return nombre;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }


    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
}
