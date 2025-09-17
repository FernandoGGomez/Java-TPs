package tp5_ejercicio11;

/**
 *
 * @author Fernando
 */
public class Cancion {
    private String titulo;
    private Artista artista;//Asociacion unidireccional

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return  titulo + "\"" +  " de " + artista;
    }
    
}
