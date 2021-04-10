/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;


public class Ordenador {

    private long codigo;
    private double precio;
    private String eslogan;

    public Ordenador() {

    }

    public Ordenador(long codigo, double precio, String eslogan) {
        this.codigo = codigo;
        this.precio = precio;
        this.eslogan = eslogan;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEslogan() {
        return eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }

}
