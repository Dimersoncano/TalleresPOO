package Taller1;

/**
 *
 * @author zDhim
 */
public class Libro {
     String titulo;
     String autor;
     int numeroPaginas;

    // Constructor 
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.numeroPaginas = 0;
    }

    // Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método toString
    @Override
    public String toString() {
        return "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Número de páginas: " + numeroPaginas;
    }
}