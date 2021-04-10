/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;


public class Perecedero extends Producto{
  private int DiasCaducar;  

    public Perecedero(int DiasCaducar, String nommbre, double precio) {
        super(nommbre, precio);
        this.DiasCaducar = DiasCaducar;
    }


    public int getDiasCaducar() {
        return DiasCaducar;
    }

    public void setDiasCaducar(int DiasCaducar) {
        this.DiasCaducar = DiasCaducar;
    }
    
  @Override
   public double  Calcular(int Cantidad){
     double  PrecioTotal=Cantidad*this.precio;
     
     switch(this.DiasCaducar){
         case 1:
               PrecioTotal=(PrecioTotal/4);
             break;
         case 2:
             PrecioTotal=(PrecioTotal/3);
             break;
         case 3:
             PrecioTotal=(PrecioTotal/2);
             break;
     }  
       return ( PrecioTotal);
   }
   
  @Override
   public String mostrarDatos(){
      return("NOMBRE: "+this.nombre+" PRECIO: "+this.precio+" DIAS A CADUCAR: "+this.DiasCaducar+"descuentio es :"+Calcular(DiasCaducar));
  } 

}

