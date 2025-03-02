package Taller1;

/**
 *
 * @author zDhim
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    // Constructorr
    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.curso = "No asignado";
    }

    // Constructor  2 parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "No asignado";
    }

    // Constructor con tres parámetros usando el this()
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    // Método toString 
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Curso: " + curso;
    }
}