/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveterinaria;

/**
 *
 * @author Sofia
 */
public class EjercicioVeterinaria {

    /**
     * 
     */
    public static void main(String[] args) {
        
        Mascota Perro=new Perro("Tin", "pequines","hembra", true, "chico");
        Mascota Perro2=new Perro("Tin", "pequines","hembra", true, "chico");
        Mascota Perro3=new Perro("Tin", "pequines","hembra", true, "chico");
        
        Veterinaria miVeterinaria=new Veterinaria("Canes", "Nicolas", 200, 100);
        
        miVeterinaria.IngresarAnimal(Perro);
        miVeterinaria.IngresarAnimal(Perro2);
        
        
        
        
        int precio=miVeterinaria.MostrarFacturado();
        System.out.println(precio);
        
        
    }
   
}
