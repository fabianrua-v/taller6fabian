/*Una agencia vendedora de autos desea un sistema computacional para administrar 
 los datos de sus vehículos y clasificarlos por tipo. Todos los autos tienen los siguientes datos:
• Número de serie del motor.
• Marca.
• Año.
• Precio.
Los vehículos se clasifican en autos compactos, autos de lujo, camionetas y vagonetas.
Para los autos y vagonetas, también es importante almacenar la cantidad de pasajeros;
mientras que para las camionetas se debe controlar la capacidad de carga en kgs. 
y la cantidad de ejes y de rodadas.

Modele este sistema con diagramas de clases en UML e instancie cada una de las clases,
asignándole datos mediante sus respectivas propiedades. Agregue un constructor con parámetros a cada clase para
inicializar sus datos e invoque el constructor de la clase base desde el constructor de cada clase derivada (no utilice constructores default).
Implemente la sobrescritura del método ToString() para mostrar los datos de cada tipo de auto. 
NOTA: No se permiten componentes duplicados en las clases ni clases vacías (sin elementos).

 */
package Ejercicio7;

public class Vehiculo {
    private int numSerie;
    private String marca;
    private int anio;
    private double precio;

    public Vehiculo(int numSerie, String marca, int anio, double precio) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String mostrarInfo(){
        return "numero serie -> "+numSerie+" marca ->"+marca+" año ->"+anio+" precio  ->"+precio;
    }
    
}
