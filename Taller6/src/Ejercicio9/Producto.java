/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;


public class Producto {
    protected  String nombre;
    protected double precio;

    public Producto(String nommbre, double precio) {
        this.nombre = nommbre;
        this.precio = precio;
    }

    public String getNommbre() {
        return nombre;
    }

    public void setNommbre(String nommbre) {
        this.nombre = nommbre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
     public double  Calcular(int Cantidad){
     return(this.precio*Cantidad);
 }
    public  String mostrarDatos(){
        return "NOMBRE :-> "+this.nombre+" PRECIO :-> "+this.precio;
        
    }
}
