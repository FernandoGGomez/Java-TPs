package tp5_ejercicio8;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio8 {
    public static void main(String[] args) {
       Usuario usuario = new Usuario("Juan", "juan@email.com");
       Documento doc = new Documento("Algebra de Boole", "loremipsum", "hkjsf", "17/9/2025", usuario);
       
        System.out.println(doc);
    }   
}
