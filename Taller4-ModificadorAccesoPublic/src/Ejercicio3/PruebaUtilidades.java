/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Dimerson
 */
public class PruebaUtilidades {
    public static void main(String[] args) {
        System.out.println("Suma: " + Utilidades.suma(10, 5));
        System.out.println("Resta: " + Utilidades.resta(10, 5));
        System.out.println("Multiplicación: " + Utilidades.multiplicacion(10, 5));
        System.out.println("División: " + Utilidades.division(10, 5));
        System.out.println("División por cero: " + Utilidades.division(10, 0));
    }
}