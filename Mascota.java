/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveterinaria;

/**
 *Clase Mascota
	-Nombre String
	-Raza String
	-EstaBañado boolean
-sexo string
+Constructor , que recibe por parámetros el nombre y la raza, EstaBañadp siempre se inicializa en false.	
	+GetterNombre(): string
	+bañar()cambia el estado de “EstaBañado” solo si está el false.
+ToString()
 * 
 */
public class Mascota {
    
    private String _nombre;
    private String _raza;
    private boolean _estaBañado;
    private String _sexo;
    
    public Mascota(String nombre,String raza,String sexo){
        
        this._nombre=nombre;
        this._raza=raza;
        this._sexo=sexo;
        this._estaBañado=false;
        
    }
    
    public String GetterNombre(){
        
        return this._nombre;
    }
    
    public void EstaBañado(){
        this._estaBañado=true;
    }
    
    public String ToString(){
        
        return "Nombre de la mascota: "+this._nombre+" Sexo de la mascota "
                +this._sexo+" Raza "+this._raza+" Está bañado "+this._estaBañado;
       
    }
    
    
}
