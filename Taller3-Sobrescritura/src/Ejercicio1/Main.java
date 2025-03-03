package Ejercicio1;
/**
 *
 * @author zDhim
 */
public class Main {
    public static void main(String[] args) {
        Persona P1 = new Persona();
        Persona E1 = new Estudiante();
        Persona prof1 = new Profesor();

        P1.Presentarse();    // "Hola, soy una persona."
        E1.Presentarse(); // "Hola, soy un estudiante de unicolombo"
        prof1.Presentarse();   // "Hola, soy un profesor de unicolombo."
    }
}