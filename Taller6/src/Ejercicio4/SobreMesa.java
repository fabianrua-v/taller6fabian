/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;


public class SobreMesa extends Ordenador{
    private String descripcionTorre;
    public SobreMesa(){
        }
    public SobreMesa(long codigo, double precio, String eslogan, String descripcionTorre){
         super(codigo, precio, eslogan);
         this.descripcionTorre = descripcionTorre;
         
    }

    public String getDescripcionTorre() {
        return descripcionTorre;
    }

    public void setDescripcionTorre(String descripcionTorre) {
        this.descripcionTorre = descripcionTorre;
    }
}
