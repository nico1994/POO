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
public class ArticuloLiquido extends Articulo {
    private float _litros;

    public ArticuloLiquido(String nombre, Integer codigo, float costo, float precioVenta, int stock,float litros) {
        super(nombre, codigo, costo, stock);
        this._litros=litros;
    }
    
   
   
}
