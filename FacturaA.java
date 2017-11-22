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
public class FacturaA extends Documento {
    private float iva;
    
    public FacturaA(int numero){
        super(numero);
        
    }
    public void setterNumero(int numero){
        
        this._numero=numero;
    }
    
    public void MostrarDatosCompletos(){
        super.MostrarDatosCompletos();
    }
    
}