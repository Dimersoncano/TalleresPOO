/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Dimerson
 */
public class Producto {
    String nombre;   
    double precio;   
    int stock;    

    // Constructor 
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


    void mostrarInfo() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio + ", Stock: " + stock);
    }
}