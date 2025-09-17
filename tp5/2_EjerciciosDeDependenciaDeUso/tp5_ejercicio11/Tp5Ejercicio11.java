package tp5_ejercicio11;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio11 {

    public static void main(String[] args) {
        Cancion cancion = new Cancion("Despacito");
        Artista artista = new Artista("Luis Fonsi", "Reggaeton");
        Reproductor reproductor = new Reproductor();
        
        cancion.setArtista(artista);
        
        reproductor.reproducir(cancion);
        
    }
    
}
