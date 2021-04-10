/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;


public class Ppal {

    public static void main(String[] args) {
        AutoLujo al = new AutoLujo(20, 123, "lamborgini", 2009, 3000);
        System.out.println(al.mostrarInfo());

        AutoCompacto ac = new AutoCompacto(3, 444, "honda", 3009, 4000);
        System.out.println(ac.mostrarInfo());
        Vagoneta vg = new Vagoneta(4, 666, "audi", 4009, 789);
        System.out.println(vg.mostrarInfo());
        Camioneta c = new Camioneta(400, 4, 40, 300, "nissan", 3002, 4082);
        System.out.println(c.mostrarInfo());

    }
}
