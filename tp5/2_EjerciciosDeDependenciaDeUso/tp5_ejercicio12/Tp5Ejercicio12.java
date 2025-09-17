package tp5_ejercicio12;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio12 {
    
    public static void main(String[] args) {
        
        Contribuyente contribuyente = new Contribuyente("Juan", "20-12435-9");
        Impuesto impuesto = new Impuesto(20);
        Calculadora calculadora = new Calculadora();
    
        calculadora.calcular(impuesto);
    
    }    
}
