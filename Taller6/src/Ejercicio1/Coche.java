/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Dimerson
 */
public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0; // Atributo estático compartido

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // Incrementa el contador cada vez que se crea un objeto
    }

    public static void mostrarContadorCoches() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
