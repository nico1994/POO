/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        FacturaA mifactura= new FacturaA(66);
//        //mifactura.SetNumero(66);
//        //mifactura.Mostrar();
//      //abstraccion herencia y poliformismo.  
//  
//        AlumnoEgresado unAluEg=new AlumnoEgresado();
//        //unAluEg.MostrarLosDatos();
//        
//        
//        //poliformismo
//        ArrayList<Persona> listadoPersonas=new ArrayList<Persona>();
//        
//        
//        listadoPersonas.add(unAluEg);
//        
//        Alumno unAlum=new Alumno();
//        
//        listadoPersonas.add(unAlum);
//        
//        Persona unPer=new Persona();
//        
//        listadoPersonas.add(unPer);
        
        
        //forma 1
//        for (int i = 0; i < listadoPersonas.size(); i++) {
//            listadoPersonas.get(i).MostrarLosDatos();
//        }
        //forma 2
//        for (Persona alguno : listadoPersonas) {
//            
//            alguno.MostrarLosDatos();
//        }
        //forma 3
        
//        Iterator<Persona> iterador=listadoPersonas.iterator();
//        while(iterador.hasNext()) //da un boolean si hay otro para recorrer
//        {
//           Persona nueva= iterador.next();
//           nueva.MostrarLosDatos();
//        }
//        
         //no anda por ahora, falta el to..
//        System.out.println(listadoPersonas);

        // de string
//        ArrayList<String> listadoPalabras=new ArrayList<String>();
//        
//        listadoPalabras.add("Primera");
//        listadoPalabras.add("Segunda");
//        listadoPalabras.add("Tercera");
//        
//        System.out.println("Listado"+listadoPalabras);
        
        ArrayList<Documento> lista=new ArrayList<Documento>();
        
        Remito miRemito=new Remito(2);
        FacturaA miFacA=new FacturaA(4);
        FacturaB miFacB=new FacturaB(6);
        
        lista.add(miRemito);
        lista.add(miFacA);
        lista.add(miFacB);
        
        for (Documento lista1 : lista) {
            
            lista1.MostrarDatosCompletos();
        }
        
       
        
        
        
        
          
        }

    private static Object iterador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        }
    
    

