/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Dimerson
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Suma: " + Matematicas.suma(10, 5));
        System.out.println("Resta: " + Matematicas.resta(10, 5));
        System.out.println("Multiplicación: " + Matematicas.multiplicacion(10, 5));
        System.out.println("División: " + Matematicas.division(10, 5));
        System.out.println("División por cero: " + Matematicas.division(10, 0));
    }
}
