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
public class Alumno extends Persona {
    private Date _Fechainsc;
    private int _legajo;
    
    public void MostrarLosDatos(){
        super.MostrarLosDatos();
        System.out.println("Fecha insc "+this._Fechainsc);
        System.out.println("Legajo numero "+this._legajo    );
    }
}