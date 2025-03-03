/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Dimerson
 */
public class CuentaBancariaCorrecta {
    private double saldo;

    public CuentaBancariaCorrecta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: $" + saldo);
    }
}