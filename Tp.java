/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

/**
 *
 * @author Sofia
 */
public class Tp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Articulo lavandina=new Articulo("Lavandina", 213, 14, 20);
        Articulo queso=new Articulo("queso", 219, 30, 10);
        Articulo jamon=new Articulo("jamon", 213, 32, 12);
        
        
       Venta miVe=new Venta(lavandina, 3);
       Venta miVe1=new Venta(lavandina, 6);
       Venta miVe2=new Venta(jamon, 8);
       Venta miVe3=new Venta(queso, 1);
       
        miVe.MostrarVenta();
        
        
       Comercio miCo=new Comercio("Nico");
       miCo.MostrarVentas();
       
        
    }
    
}
