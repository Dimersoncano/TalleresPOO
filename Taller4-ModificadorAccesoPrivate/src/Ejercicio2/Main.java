package Ejercicio2;

/**
 *
 * @author zDhim
 */
public class Main {
     public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 180);
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad Máxima: " + coche.getVelocidadMaxima());
        
        coche.acelerar(20);
        System.out.println("Velocidad Máxima tras acelerar: " + coche.getVelocidadMaxima());
    }
}