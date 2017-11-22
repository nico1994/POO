/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author alumno
 */
public class Remito extends Documento {
    private int FechaEntrega;
    
    public Remito(int numero){
        super(numero);
    }
    public void setterFecha(int Fecha){
        this.FechaEntrega=Fecha;
    }
    
    public void MostrarDatosCompletos(){
        super.MostrarDatosCompletos();
    }
}