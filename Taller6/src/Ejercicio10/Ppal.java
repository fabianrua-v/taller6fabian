/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;


public class Ppal {

    public static void main(String[] args) {
        AutoBus a = new AutoBus(500, 0, 10, "wers", true);
        System.out.println("EL AUTOBUS ");
        System.out.print("SU IMPORTE ES : "+a.calcularImporte() + a.estado());
       
    }
}
