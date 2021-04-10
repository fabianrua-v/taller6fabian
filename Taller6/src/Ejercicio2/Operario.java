/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;


public class Operario extends Empleado{

    public Operario(String nombre) {
        super(nombre);
    }

    public Operario() {
    }
    
    @Override
    public String cargo(String nombre){
       String  cargo = "operario" + nombre;
        return cargo;
    }
}
