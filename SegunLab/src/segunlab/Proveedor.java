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
public class Proveedor {
    private String nombreProveedor;
    private double deuda;
    private boolean calceldado;
      
    private String plazo;

    public boolean isCalceldado() {
        return calceldado;
    }

    public void setCalceldado(boolean calceldado) {
        this.calceldado = calceldado;
    }
    
    

    public Proveedor(String nombreProveedor, double deuda, String plazo, boolean cancelado) {
        this.nombreProveedor = nombreProveedor;
        this.deuda = deuda;
        this.calceldado= cancelado;
        this.plazo = plazo;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public double getDeuda() {
        return deuda;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }
    
    
    
}
