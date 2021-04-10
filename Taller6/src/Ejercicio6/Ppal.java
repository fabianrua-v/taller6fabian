/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

public class Ppal {

    public static void main(String[] args) {
        
        Empleado e = new Empleado(500000);
        System.out.println(e.calcularSueldo());

        EmpleadoPorHora eh = new EmpleadoPorHora(50, 4000);
        System.out.println(eh.calcularSueldo());
        
        EmpleadoPorComision ec = new EmpleadoPorComision(1000000, 10);
        System.out.println(ec.calcularSueldo());
        
        EmpleadoAsalariadoPorComision eac = new EmpleadoAsalariadoPorComision(10, 1000000, 500000);
        System.out.println(eac.calcularSueldo());
        
    }
}
