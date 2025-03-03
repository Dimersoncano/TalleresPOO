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
        Empleado empleado1 = new Empleado("Ana", 3000);
        Gerente gerente1 = new Gerente("Luis", 5000, "Finanzas");

        empleado1.mostrarDetalles();
        gerente1.mostrarDetalles();
    }
}
