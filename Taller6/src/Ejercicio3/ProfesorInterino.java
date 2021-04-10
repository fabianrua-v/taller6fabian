/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Date;


public final class ProfesorInterino  extends Profesor{
         private Date fecha = new Date();

    public ProfesorInterino(String id, String nombre, String apellido) {
        super(id, nombre, apellido);
    }

    public ProfesorInterino() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

         
         public Date FechaIncor(){
             Date fechainc = new Date();
             return fechainc;
         }
}
