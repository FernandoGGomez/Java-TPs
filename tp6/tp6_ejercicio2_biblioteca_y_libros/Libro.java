package tp6_ejercicio2_biblioteca_y_libros;

/**
 *
 * @author Fernando
 */
public class Libro {
    String isbn;
    String titulo;
    int anioPublicacion;
    Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    
    
    public void mostrarInfo(){
    System.out.println("Titulo: " + titulo);
    System.out.println("ISBN: " + isbn);
    System.out.println("Anio: " + anioPublicacion);
    System.out.println("Autor: ");
    autor.mostrarInfo();
  
    }

    public String getIsbn() {
        return isbn;
    }

    
    
    public Autor getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }
    
    
    
}
