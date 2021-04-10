/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;


public class EmpleadoAsalariado  extends  Empleado{

  private double salariofijo;

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(double sueldo) {
        super(sueldo);
    }

  

    public double getSalariofijo() {
        return salariofijo;
    }

    public void setSalariofijo(double salariofijo) {
        this.salariofijo = salariofijo;
    }
  
    /**
     *
     * @return
     */
    @Override
    public double calcularSueldo(){
        this.salariofijo = 600000;
        return  salariofijo;
    }
    
}
