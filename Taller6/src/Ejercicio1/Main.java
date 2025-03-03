/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Dimerson
 */
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Focus");

        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
        coche3.mostrarInformacion();

        // Llamada al método estático sin necesidad de instanciar un objeto
        Coche.mostrarContadorCoches();
    }
}
