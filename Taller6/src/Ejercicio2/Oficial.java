/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;


public final class Oficial  extends Operario {

    public Oficial(String nombre) {
        super(nombre);
    }

    public Oficial() {
    }
     @Override
    public String cargo(String nombre){
       String  cargo = "Oficial" + nombre;
        return cargo;
    }
}
