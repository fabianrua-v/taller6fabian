/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;


public class Vehiiculo {
    private String Placa ;
    private boolean est;

    public Vehiiculo(String Placa, boolean est) {
        this.Placa = Placa;
        this.est = est;
    }
    public Vehiiculo(String Placa) {
        this.Placa = Placa;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
  

    public boolean isEst() {
        return est;
    }

    public void setEst(boolean est) {
        this.est = est;
    }
      public boolean estado(){
            if (est ==true) {
                System.out.println("el vehiculo esta alquilado");
                est = false;
            }
            else {
                System.out.println("el vehiculo no esta alquilado");
                est=true;
                
            }
          return est;
    }
      public double calcularImporte(){
          return  0;
      }
}
