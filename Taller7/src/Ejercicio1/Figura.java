/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Dimerson
 */
public abstract class Figura {
    public abstract double calcularArea(); // Método abstracto

    public void mostrarArea() {
        System.out.println("El área es: " + calcularArea());
    }
}