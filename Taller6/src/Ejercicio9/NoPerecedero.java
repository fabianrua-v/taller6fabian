/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;


public class NoPerecedero extends Producto{
    private String Tipo;

    public NoPerecedero(String Tipo, String nombre, double precio) {
        super(nombre, precio);
        this.Tipo = nombre;
    }
    

    public void setTipo(String Tipo) {
        this.Tipo = nombre;
    }
    @Override
 public String mostrarDatos(){
      return("NOMBRE: "+ this.nombre +" PRECIO: "+this.precio+" TIPO: "+this.Tipo);
  }  


    
}
