package tp5_ejercicio3;

/**
 *
 * @author Fernando
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;//Asociacion unidireccional
    private Editorial editorial;//Relacion de Agregacion
    
    
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    
    
    
}
