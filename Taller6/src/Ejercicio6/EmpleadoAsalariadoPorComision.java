/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;


public class EmpleadoAsalariadoPorComision  extends Empleado{
 
    private double PorcentajeVenta;
    private double  venta;

    public EmpleadoAsalariadoPorComision(double PorcentajeVenta, double venta, double sueldo) {
        super(sueldo);
        this.PorcentajeVenta = PorcentajeVenta;
        this.venta = venta;
    }

    public double getPorcentajeVenta() {
        return PorcentajeVenta;
    }

    public void setPorcentajeVenta(double PorcentajeVenta) {
        this.PorcentajeVenta = PorcentajeVenta;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }
     @Override
    public double calcularSueldo(){
        return (super.getSueldo() +(venta*PorcentajeVenta/100)+((super.getSueldo()*10)/100) );
    }
    

}
