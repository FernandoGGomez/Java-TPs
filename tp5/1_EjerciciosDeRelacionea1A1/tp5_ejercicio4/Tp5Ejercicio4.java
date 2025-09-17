package tp5_ejercicio4;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio4 {
    public static void main(String[] args) {
        Banco banco = new Banco("Bank", "12445432");
        Cliente cliente = new Cliente("2143","12345678");
        TarjetaDeCredito tjcredito = new TarjetaDeCredito("1235-234...", "10/32", banco); 
        
        cliente.setTarjetaDeCredito(tjcredito);
        
        System.out.println("Cliente: " + cliente);
        System.out.println("Tarjeta de Credito: " + tjcredito);
       
        
    }
}
