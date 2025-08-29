package tp3;

/**
 *
 * @author Fernando
 */

/*
3. Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor,
añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación
para añoPublicacion.
*/
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    String getTitulo(){
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion > 0 && anioPublicacion < 2025 ){
            this.anioPublicacion = anioPublicacion;
        }
    }
}
