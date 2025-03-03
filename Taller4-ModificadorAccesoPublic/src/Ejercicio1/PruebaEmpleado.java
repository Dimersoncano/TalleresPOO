/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Dimerson
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos", 2500);
        empleado1.mostrarInformacion();

        empleado1.setSalario(-1000); // Intento de asignar un salario inválido
        empleado1.setSalario(3000);
        empleado1.mostrarInformacion();
    }
}