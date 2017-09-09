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
    private int deuda;
    private int plazo;

    public Proveedor(String nombreProveedor, int deuda, int plazo) {
        this.nombreProveedor = nombreProveedor;
        this.deuda = deuda;
        this.plazo = plazo;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public int getDeuda() {
        return deuda;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    public void facturaVencer (){
        for (int i = 0; i < this.plazo; i++) {
            
        }
    }
}
