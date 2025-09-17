package tp5_ejercicio12;

/**
 *
 * @author Fernando
 */
public class Calculadora {
    public void calcular(Impuesto impuesto){//Dependencia de uso con la clase Impuesto
        System.out.println("Monto del impuesto:" + impuesto.getMonto());
    }
}
