package tp5_ejercicio12;

/**
 *
 * @author Fernando
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; //Asociacion Unidireccional

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public double getMonto() {
        return monto;
    }
    
}
