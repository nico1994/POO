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
public class Venta {
    public Articulo vendido;
    private int cantidad;
    private float precioVenta;
    
    public void MostrarVenta(){
        System.out.println("Producto : "+this.vendido);
        System.out.println("Precio venta: "+this.precioVenta);
        System.out.println("Precio cantidad : "+this.cantidad);
        
    }
    
    public Venta(Articulo vendido,int cantidad){
        this.vendido=vendido;
        this.cantidad=cantidad;
        this.precioVenta=vendido.GetPrecioCosto()*(float)1.25;
       
    }
    
    
    public float RetornarGanancia(){
        
        float ganancia=this.precioVenta-vendido.GetPrecioCosto();
        return ganancia;
    }
    
    
    
    
    
    
    
    
    
    
    
//    public Articulo GetVendido(){
//        
//        Articulo retorno=this.vendido;
//        
//        return retorno;
//    }
//    
//    public void SetterProdVendido(Articulo prodvendido){
//        this.vendido=prodvendido;
//    }
//   
//    public int GetCantidad(){
//        
//        int retorno=this.cantidad;
//        
//        return retorno;
//    }
//    
//    public void SetterCantidad(int cantidad){
//        this.cantidad=cantidad;
//    }
    
    
    
}
