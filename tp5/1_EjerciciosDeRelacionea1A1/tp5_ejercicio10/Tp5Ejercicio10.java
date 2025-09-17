package tp5_ejercicio10;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio10 {
    public static void main(String[] args) {
        CuentaBancaria cuentaBanc = new CuentaBancaria("002343","234324");
        Titular titular = new Titular("Juan","40765432");
        
        titular.setCuentaBancaria(cuentaBanc);
        
        System.out.println(titular);
        System.out.println(cuentaBanc);
    }
       
}
