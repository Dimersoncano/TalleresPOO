package Taller2;
import javax.swing.JOptionPane;
/**
 *
 * @author zDhim
 */
public class Producto {
    public String nombre;
    public double precio;

    // Constructor de 2 parametros con this
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void MostrarProducto() {
        JOptionPane.showMessageDialog(null, "Producto: " + this.nombre + "\nPrecio: $" + this.precio);
    }

     
 }