package Taller2;

import javax.swing.JOptionPane;

/**
 *
 * @author zDhim
 */
public class Main {

    public static void main(String[] args) {
           
      // OBJETO PARA MOSTRAR PRODUCTO
      
      
    String Nombre = JOptionPane.showInputDialog("Ingresa el nombre del producto");
    String PrecioStr  = JOptionPane.showInputDialog("Ingresa el precio del producto");
     
    double Precio = Double.parseDouble(PrecioStr);
     
   Producto p1 = new Producto(Nombre, Precio);
   p1.MostrarProducto();
   
   
   // OBJETO PARA MOSTRAR ESTUDIANTE
   
   
    Estudiante estudiante1 = new Estudiante();
        estudiante1.MostrarDetallesEstudiante();

       
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad del estudiante:");

        // Convertir la edad de String a int
        int edad = Integer.parseInt(edadStr);

       
        Estudiante estudiante2 = new Estudiante(nombre, edad);
        estudiante2.MostrarDetallesEstudiante();
    }
}