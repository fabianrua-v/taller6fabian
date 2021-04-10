/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.util.Date;


public class Tactor  extends Vehiiculo{
    private Date fechaRenta;
    private Date fechaDevolucion;
    private double precioDia;

    public Tactor(Date fechaRenta, Date fechaDevolucion, double precioDia, String Placa, boolean est) {
        super(Placa, est);
        this.fechaRenta = fechaRenta;
        this.fechaDevolucion = fechaDevolucion;
        this.precioDia = precioDia;
    }

    public Date getFechaRenta() {
        return fechaRenta;
    }

    public void setFechaRenta(Date fechaRenta) {
        this.fechaRenta = fechaRenta;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    @Override
    public boolean estado() {
        return super.estado(); //To change body of generated methods, choose Tools | Templates.
    }

   public double calcularImporte(){
          return  0;
      }
    
    
    
}
