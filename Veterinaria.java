/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveterinaria;

import java.util.ArrayList;

/**
 *
 * Clase Veterinaria
	-Nombre
	-Dueño
	-ListadoDeMascotas
-PrecioGato
-PrecioPerro
+Constructor , recibe todo menos la lista que la inicializa en el constructor
+IngresarAnimal()
+MostrarTotalFacturado()
+ MostrarTotalFacturadoPorTipo(string tipo)
+toString()
+MostrarVeterinaria()
 */
public class Veterinaria {
    private String _nombre;
    private String _dueño;
    private ArrayList<Mascota> ListaDeMascotas;
    private int PrecioGato;
    private int PrecioPerro;

    public Veterinaria(String _nombre, String _dueño, int PrecioGato, int PrecioPerro) {
        this._nombre = _nombre;
        this._dueño = _dueño;
        this.PrecioGato = PrecioGato;
        this.PrecioPerro = PrecioPerro;
        this.ListaDeMascotas=new ArrayList<Mascota>();
    }
    
    public void IngresarAnimal(Mascota nombre){
        
       this.ListaDeMascotas.add(nombre);
        
    }
    
    public String MostrarMascotas(){
        
        for (Mascota ListaDeMascota : ListaDeMascotas) {
            
         return ListaDeMascota.ToString();
        }
        return ".";
    }
    
    public int MostrarFacturado(){
        int precio=0;
        
        precio=this.PrecioGato*ListaDeMascotas.size();
            return precio;
        }
        
        
    }
    
   
    

