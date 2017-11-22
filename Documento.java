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
public class Documento  {
    protected int _numero;
    
    public Documento(int numero){
        System.out.println("constructor documento");
        this._numero=numero;
    }
    
    
    public void SetNumero(int numero ){
        this._numero=numero;
    }
            
            
    public void Mostrar(){
        System.out.println("El número es: "+this._numero);
                
    }
   
    public void MostrarDatosCompletos(){
        this.Mostrar();
    }
}
