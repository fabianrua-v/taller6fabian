/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;


public class Auto extends  Vehiculo{
    private int cantPasajero;

    public Auto(int cantPasajero, int numSerie, String marca, int anio, double precio) {
        super(numSerie, marca, anio, precio);
        this.cantPasajero = cantPasajero;
    }

    public int getCantPasajero() {
        return cantPasajero;
    }

    public void setCantPasajero(int cantPasajero) {
        this.cantPasajero = cantPasajero;
    }
    @Override
      public String mostrarInfo(){
          
       return super.mostrarInfo()+"cantidad pasajeros -> "+cantPasajero;
               
      }
    
}
