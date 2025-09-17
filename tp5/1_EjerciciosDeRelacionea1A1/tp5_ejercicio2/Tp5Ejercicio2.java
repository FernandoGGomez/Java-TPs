package tp5_ejercicio2;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio2 {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Fernando","42109622");
        Celular cel = new Celular("124234","Motorola","G82");
        
        usuario.setCelular(cel);
        
        System.out.println("Celular: " + cel);
        System.out.println("Usuario del celular: " + cel.getUsuario());
        
    }
}
