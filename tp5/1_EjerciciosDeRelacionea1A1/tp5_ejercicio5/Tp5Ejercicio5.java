package tp5_ejercicio5;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio5 {
    public static void main(String[] args) {
        Computadora pc = new Computadora("Asus", "12345", "B650M-a", "AM5");
        Propietario propietario = new Propietario("Juan", "987654321");
        
        pc.setPropietario(propietario);
        
        System.out.println(pc);
        System.out.println(propietario);
        
        
    }
}
