package tp5_ejercicio1;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio1 {

    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte("ABC123456", "17/9/2025","imagen","jpg");
        Titular titular = new Titular("Fernando", "12345678");
        
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular());
        System.out.println("Foto del pasaporte: " + pasaporte.getFoto());

        titular.setPasaporte(pasaporte);
        
        System.out.println("Pasaporte del titular: " + titular.getPasaporte());
        
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular());

    }
    
}
