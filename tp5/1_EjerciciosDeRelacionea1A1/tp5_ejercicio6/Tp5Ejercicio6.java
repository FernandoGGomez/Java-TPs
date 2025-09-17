package tp5_ejercicio6;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio6 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "1234567");
        Mesa mesa = new Mesa("5", 4);
        Reserva reserva = new Reserva("20/9/2025","21:00",mesa);
        
        System.out.println("Reserva antes de setear cliente: " + reserva);
        
        reserva.setCliente(cliente);
        
        System.out.println("Reserva despues de setear cliente: " + reserva);
    }    
}
