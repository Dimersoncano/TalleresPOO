package Taller2;
import javax.swing.JOptionPane;

public class Estudiante {
    private String nombre;
    private int edad;

    // Constructor por defecto que llama al constructor con valores predeterminados usando thisss
    public Estudiante() {
        this("Desconocido", 0);
    }

    // Constructor 2 parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void MostrarDetallesEstudiante() {
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre + "\nEdad: " + this.edad);
    }
}