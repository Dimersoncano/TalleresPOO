package Taller1;

/**
 *
 * @author zDhim
 */
public class CuentaBancaria {
    
     String numeroCuenta;
     double saldo;
     String tipoCuenta;

    // Constructor 
    public CuentaBancaria() {
        this.numeroCuenta = "00000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Desconocido";
    }

    // Constructor 2 parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor sobrecargado 3 parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método toString
    @Override
    public String toString() {
        return "Número de Cuenta: " + numeroCuenta + "\n" +
               "Saldo: " + saldo + "\n" +
               "Tipo de Cuenta: " + tipoCuenta;
    }
}