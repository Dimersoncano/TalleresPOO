
package Ejercicio2;

/**
 *
 * @author Dimerson
 */
public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("12345678", 5000, "Ahorro");
        cuenta1.mostrarDetalles();

        cuenta1.setSaldo(7000);
        cuenta1.mostrarDetalles();

        // Intento de acceso directo a numeroCuenta (provocará error de compilación)
        // System.out.println(cuenta1.numeroCuenta);
    }
}
