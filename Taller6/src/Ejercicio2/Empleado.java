/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;


public class Empleado {
    private String nombre;
   
    public Empleado(){
        
    }
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
    public  String cargo( String nombre){
        String  cargo = " " + nombre;
        return cargo;
    }
}
