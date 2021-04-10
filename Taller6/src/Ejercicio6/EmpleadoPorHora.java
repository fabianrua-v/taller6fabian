/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;


public class EmpleadoPorHora extends Empleado {
    private int numHoras;
    private double valorHoras;

   

    public EmpleadoPorHora(int numHoras, double valorHoras, double sueldo) {
        super(sueldo);
        this.numHoras = numHoras;
        this.valorHoras = valorHoras;
    }
public EmpleadoPorHora( int numHoras, double valorHoras){
     this.numHoras = numHoras;
        this.valorHoras = valorHoras;
}
    
    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }
    
    @Override
    public double calcularSueldo(){
        double salario= 0;
        if (numHoras >40) {
            double horasExtra = this.numHoras -40;
            return ((valorHoras*numHoras)+horasExtra*2000);
        }
        else
             return salario = valorHoras*numHoras ;
        
     
    
}
}
