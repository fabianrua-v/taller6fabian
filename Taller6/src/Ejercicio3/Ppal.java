/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Ppal {
    public static void main(String[] args) {
        Persona p = new Persona();
        Profesor prof = new Profesor("PABLO", "JIMENEZ ROCHA ", "PROF: 2086");
        ProfesorInterino proint = new ProfesorInterino();
        
      //  proint.getFecha();
        Date fecha  = new Date();
       //System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(fecha));
        
        System.out.println(" Profesor : "+prof.getNombre()+" " + prof.getApellido()+ "con Id de profesor " + prof.getId()+"(test 1)");
        System.out.println(" El Profesor interino se incorporo : "+fecha+ "(test 2)");
        
    }
 
}
