package Ejercicio2;

/**
 *
 * @author zDhim
 */
public class Main {
    public static void main(String[] args) {
        
        //objeto
        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo bicicleta1 = new Bicicleta();


       //lamada de metodo
        
        vehiculo1.Moverse();  // "El vehículo se está moviendO rapidamente."
        bicicleta1.Moverse(); // "La bicicleta se mueve pedaleando."
    }
}