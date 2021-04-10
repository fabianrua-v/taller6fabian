/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

public class Camioneta  extends Vehiculo{
    private int capCarga, cantEjes, numRodada;

    public Camioneta(int capCarga, int cantEjes, int numRodada, int numSerie, String marca, int anio, double precio) {
        super(numSerie, marca, anio, precio);
        this.capCarga = capCarga;
        this.cantEjes = cantEjes;
        this.numRodada = numRodada;
    }

    public int getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(int capCarga) {
        this.capCarga = capCarga;
    }

    public int getCantEjes() {
        return cantEjes;
    }

    public void setCantEjes(int cantEjes) {
        this.cantEjes = cantEjes;
    }

    public int getNumRodada() {
        return numRodada;
    }

    public void setNumRodada(int numRodada) {
        this.numRodada = numRodada;
    }

    @Override
    public String mostrarInfo(){
        return "camioneta {"+super.mostrarInfo()+"cap carga -> "+capCarga+"Kg "+"   num Ejes "+cantEjes+"num rodada "+numRodada + "}";
    }
    
}
