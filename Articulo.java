/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

/**
 *
 * codigo,nombre,precio de costo,precio de venta y stock,
además debe tener lo setter de precio de venta y nombrecódigo(las dos juntas)
* ,los setter de precio costo y stock.
Constructor que reciba todos los atributos por parametros .
Metodos: (HayStock() retorna bool. de instancia) (SonIguales() recibe dos
* articulos y retorna bool metodo estático"compara el nombre y el codigo") 
 */
public abstract class  Articulo {
    private String _nombre;
    private Integer _codigo;
    private float _precioCosto;
    private float _precioVenta;
    private int _stock;
    
    //constructor con todos los atributos
    public Articulo(String nombre,Integer codigo,float costo,int stock){
        
        this._nombre=nombre;
        this._codigo=codigo;
        this._precioCosto=costo;
        this._stock=stock;
        this._precioVenta=this._precioCosto*(float)1.25;
    }
    //setter y getter de cada atributo
    public float GetStock(){
        
        int retorno=this._stock;
        
        return retorno;
    }
    
    public void SetterStock(int stock){
        this._stock=stock;
    }
    
    public float GetPrecioCosto(){
        
        float retorno=this._precioCosto;
        
        return retorno;
    }
    
    public void SetterPrecioCosto(float precioCosto){
        this._precioCosto=precioCosto;
    }
    
   
    public float GetPrecioVenta(){
        
        float retorno=this._precioVenta;
        
        return retorno;
    }
    
    public void SetterPrecioVenta(float precioVenta){
        this._precioVenta=this._precioCosto*(float)1.25;
    }
    
    public void SetterNombreCodigo(String nombre,Integer codigo){
        
        this._nombre=nombre;
        this._codigo=codigo;
     }
    
    public String GetNombreCodigo(){
        
        String retorno="";
        
        retorno=this._nombre+this._codigo;
        
        return retorno;
    }
    
    public void MostrarArticulo(){
        System.out.println("Producto : "+this._nombre);
        System.out.println("Codigo : "+this._codigo);
        System.out.println("Precio costo : "+this._precioCosto);
        System.out.println("Precio venta : "+this._precioVenta);
        System.out.println("Stock : "+this._stock);
    }
    
   public boolean HayStock(){
       boolean a=false;
        if (0<=this._stock){
            System.out.println("Hay stock");
            a=true;
        }else {
            System.out.println("No hay stock");
        }
   return a;
   }
   
   public static boolean SonIguales(Articulo art1,Articulo art2){
       
       boolean b=false;
       
       if (art1==art2){
           b=true;
       }else{
           b=false;
       }
       
       return b;
   }
    
    
}
