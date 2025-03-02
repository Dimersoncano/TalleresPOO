package Taller1;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        // objeto clase libro
        
        String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        int paginas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de páginas:"));
        Libro libro = new Libro(titulo, autor, paginas);

        // objeto cclasecuentabancaria
            
        String numeroCuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta:");
        String tipoCuenta = JOptionPane.showInputDialog("Ingrese el tipo de cuenta:");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial:"));
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        // objeto clase estudiante
        
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        String curso = JOptionPane.showInputDialog("Ingrese el curso del estudiante:");
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

       
        
        JOptionPane.showMessageDialog(null, "Detalles del Libro:\n" + libro);
        JOptionPane.showMessageDialog(null, "Detalles de la Cuenta Bancaria:\n" + cuenta);
        JOptionPane.showMessageDialog(null, "Detalles del Estudiante:\n" + estudiante);
    }
}