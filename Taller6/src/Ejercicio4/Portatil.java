/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;


public class Portatil extends Ordenador {
    private double peso;

    public Portatil(double peso) {
        this.peso = peso;
    }

    public Portatil() {
    }

    public Portatil( long codigo, double precio, String eslogan, double peso) {
        super(codigo, precio, eslogan);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
