/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;


public class Ppal {

    public static void main(String[] args) {
        Empleado e = new Empleado("rafa   ");
        Operario ope = new Operario("mario  ");
        //ope.cargo("operario");
        Directivo dir = new Directivo("alfonso");
        Oficial ofi = new Oficial("luis   ");
        Tecnico tec = new Tecnico("pablo  ");

        System.out.println("EMPLEADO --> " + e.getNombre());
        System.out.println("EMPLEADO --> " + ope.getNombre() + "--> " + dir.cargo(""));
        System.out.println("EMPLEADO --> " + dir.getNombre() + "--> " + ope.cargo(""));
        System.out.println("EMPLEADO --> " + ofi.getNombre() + "--> " + ope.cargo("") + "--> " + ofi.cargo(""));
        System.out.println("EMPLEADO --> " + ofi.getNombre() + "--> " + ope.cargo("") + "--> " + tec.cargo(""));

    }
}
