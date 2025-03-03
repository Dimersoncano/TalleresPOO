
package Ejercicio1;

/**
 *
 * @author Dimerson
 */
public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Dimerson", 20, 8.5);
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Promedio: " + estudiante.getNotaPromedio());
    }
}