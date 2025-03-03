
package Ejercicio2;

/**
 *
 * @author Dimerson
 */
public class    Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Laura", 5000, 2000);
        Empleado vendedor = new Vendedor("Carlos", 3000, 800);

        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}
