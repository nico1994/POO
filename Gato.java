/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveterinaria;

/**
 *
 * Clase Gato 
	-Araña boolean
+Constructor que recibe todos los parámetros necesarios.
+ToString()
 */
public class Gato extends Mascota{
    
    private boolean _araña;
    
    
    public Gato(String nombre, String raza, String sexo,boolean araña) {
        super(nombre, raza, sexo);
        this._araña=araña;
    }
   
    public String ToString(){
        
        return super.ToString()+this._araña;
        
    }
    
}
