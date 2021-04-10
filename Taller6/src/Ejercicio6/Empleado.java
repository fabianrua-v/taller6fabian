/*
Una compañía paga a sus empleados por semana. Los empleados son de cuatro tipos:

empleados asalariados que reciben un salario semanal fijo, sin importar el número de horas trabajadas; 
empleados por horas, que reciben un sueldo por hora y pago por tiempo extra, 
por todas las horas trabajadas que excedan a 40 horas; 

empleados por comisión, que reciben un porcentaje de sus ventas y empleados asalariados por comisión, que reciben un salario base más un
porcentaje de sus ventas.

Para este periodo de pago, la compañía ha decidido recompensar a los empleados
asalariados por comisión, agregando un 10% a sus salarios base. La compañía desea implementar una aplicación en
Java que realice sus cálculos de nómina
 */
package Ejercicio6;


public  class Empleado {
   private double sueldo;
   
   public  Empleado (){
       
   }

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public double calcularSueldo(){
       return sueldo;
    }

    }
    
    

