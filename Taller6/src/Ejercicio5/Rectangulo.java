/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;


public class Rectangulo extends Cuadrilatero{

    public Rectangulo(double x, double y) {
        super(x, y);
    }

    @Override
    public double calcularArea() {
        return getX()*getY(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
