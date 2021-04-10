/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;


public class AutoBus extends Vehiiculo{
    private double preciokm;
    private double kmInicial;
    private double kmFinal;

    public AutoBus(double preciokm, double kmInicial, double kmFinal, String Placa, boolean est) {
        super(Placa, est);
        this.preciokm = preciokm;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
    }

    public AutoBus(double preciokm, double kmInicial, double kmFinal, String Placa) {
        super(Placa);
        this.preciokm = preciokm;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
    }

    public double getKmRecorrido() {
        return preciokm;
    }

    public void setKmRecorrido(double preciokm) {
        this.preciokm = preciokm;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(double kmInicial) {
        this.kmInicial = kmInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(double kmFinal) {
        this.kmFinal = kmFinal;
    }
    
    @Override
      public double calcularImporte(){
          return  (kmFinal-kmInicial)*preciokm;
      }
      
}
