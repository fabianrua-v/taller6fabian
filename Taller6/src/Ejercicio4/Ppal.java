/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;


public class Ppal {

    public static void main(String[] args) {
        Portatil port = new Portatil(1234, 800000, " (Ideal para sus viajes) ", 30.4);
        SobreMesa sobreM = new SobreMesa(5678, 500000, "Es el que más pesa, pero el que menos cuesta", "INTEL CORE I7 CON 4.5 GHz RAM = 8GB ");

        System.out.println(" -> COMPUTADOR PORTATIL <-- \n  codigo ->" + port.getCodigo() + " \n precio de -> " + port.getPrecio() + " \n el eslogan es -> " + port.getEslogan() + " \n con un peso de -> " + port.getPeso());
        System.out.println("  \n ******************** ******* ************************ \n");
        System.out.println(" -> COMPUTADOR SOBREMESA <-- \n codigo -> " + sobreM.getCodigo() + " \n precio de -> " + sobreM.getPrecio() + " \n el eslogan es -> " + sobreM.getEslogan() + " \n La descripcion es -> " + sobreM.getDescripcionTorre());
    }
}
