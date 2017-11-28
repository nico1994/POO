/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.ArrayList;

/**
 *
 * @author Sofia
 */
public class Comercio extends Articulo {
    private String dueño;
    private ArrayList<Articulo> art=new ArrayList<Articulo>();
    private ArrayList<Venta> ven=new ArrayList<Venta>();
    
    
    public Comercio(String nombre){
        
        this.dueño=dueño;
     }
   
    public void ComprarArticulo(){
        
    }
    
    public void VenderArticulo(Venta nombre){
        
        if ()
        ven.add(nombre);
        
       }
   public void MostrarVentas(){
       for (int i = 0; i < ven.size(); i++) {
            ven.get(i).MostrarVenta();
    }}
}
//    public void ComprarArticulo(){
//        
//    }
    
   
    
//    
//    public void VenderArticulo(Articulo nombre,int cantidad ){
//        this.nombre=nombre;
//        this.cantidad=cantidad;
//        
//        al.add("EL articulo es "+this.nombre+" y la cantidad es "+this.cantidad);
//        
//     }
//    
//    public void MostrarVenta(){
//        
//        for (String alo : al) {
//            alo
//        }
//        System.out.println("EL articulo es "+this.nombre+" y la cantidad es "+this.cantidad);
//        
//    }
    
    
    
            
        








