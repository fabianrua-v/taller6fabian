/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

public class EmpleadoPorComision extends Empleado{
    private  double venta, porcentajeVenta;

    public EmpleadoPorComision(double venta, double porcentajeVenta) {
        this.venta = venta;
        this.porcentajeVenta = porcentajeVenta;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }

    public double getPorcentajeVenta() {
        return porcentajeVenta;
    }

    public void setPorcentajeVenta(double porcentajeVenta) {
        this.porcentajeVenta = porcentajeVenta;
    }
  @Override
    public double calcularSueldo(){
        return (venta *porcentajeVenta/100);
    }
    
}
