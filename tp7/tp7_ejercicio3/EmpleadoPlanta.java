package tp7_ejercicio3;

/**
 *
 * @author Fernando
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoMensual;

    public EmpleadoPlanta(double sueldoMensual, String nombre) {
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }

    
    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }
    
}
