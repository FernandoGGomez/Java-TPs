package tp5_ejercicio11;

/**
 *
 * @author Fernando
 */
public class Reproductor {
    public void reproducir(Cancion cancion){ //Dependencia de uso con Cancion
        System.out.println("Reproduciendo \"" + cancion);
    }
}
