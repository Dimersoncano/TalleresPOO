
package Ejercicio2;

/**
 *
 * @author Dimerson
 */
public class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    protected void mostrarDetalles() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca);
    }
}
