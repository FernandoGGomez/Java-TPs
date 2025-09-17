package tp5_ejercicio13;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio13 {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Fernando", "fernando@gmail.com");
        GeneradorQR generadorQr = new GeneradorQR();
        
        generadorQr.generar("http://ejemplo.com", usuario1);   
    }
    
}
