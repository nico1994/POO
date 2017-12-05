/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveterinaria;

/**
 *
 * Clase Perro
	-Muerde boolean
	-Tamaño ( chico, mediano, grande , gigante)
	+Constructor que recibe todos los parámetros necesarios.
+ToString()
 */
public class Perro extends Mascota {
    
    private boolean _muerde;
    private String _tamaño;
    
     

    public Perro(String nombre, String raza, String sexo,boolean muerde,String tamaño) {
        super(nombre, raza, sexo);
        this._muerde=muerde;
        this._tamaño=tamaño;
    }
    
     public String ToString(){
        
        return super.ToString()+this._tamaño+this._muerde;
       
    }
}