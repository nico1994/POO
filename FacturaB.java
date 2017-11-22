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
public class FacturaB extends Documento{
    private float iibb;
    
    public FacturaB(int numero){
        super(numero);
    }
    public void setterIIBB(float IIBB){
        this.iibb=IIBB;
        
    }
    
    public void MostrarDatosCompletos(){
        super.MostrarDatosCompletos();
    }
    
}