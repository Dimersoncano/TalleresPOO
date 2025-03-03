/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Dimerson
 */
public class Main {
    public static void main(String[] args) {
        BancoSeguro cuenta1 = new BancoSeguro(5000);
        System.out.println("Saldo inicial: $" + cuenta1.getSaldo());

        cuenta1.depositar(2000);
        System.out.println("Saldo después del depósito: $" + cuenta1.getSaldo());

        cuenta1.retirar(3000);
        System.out.println("Saldo después del retiro: $" + cuenta1.getSaldo());

        // Intento de acceso directo a saldo (provocará error de compilación)
        // System.out.println(cuenta1.saldo);
    }
}