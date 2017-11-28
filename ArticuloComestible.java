/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.Date;

/**
 *
 * @author Sofia
 */
public class ArticuloComestible extends Articulo {
    private Date fechaVencimiento;

    public ArticuloComestible(String nombre, Integer codigo, float costo, int stock,Date fechaVencimiento) {
        super(nombre, codigo, costo, stock);
        this.fechaVencimiento=fechaVencimiento;
    }
    
  
}
