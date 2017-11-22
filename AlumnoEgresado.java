/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class AlumnoEgresado extends Alumno {
    private Date _fechaEgre;
    private float _promedio;
    
    public void MostrarLosDatos(){
        super.MostrarLosDatos();
        System.out.println("Fecha de egreso es"+this._fechaEgre);
        System.out.println("EL promedio es "+this._promedio);
      
    }
}
