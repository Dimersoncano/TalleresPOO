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
        Moto moto1 = new Moto("Deportiva", "Yamaha", 600);
        moto1.mostrarInformacion();

        // Intento de acceso desde una clase no relacionada (provocará error de compilación)
        // System.out.println(moto1.marca);
    }
}