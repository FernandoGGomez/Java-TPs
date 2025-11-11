package tp7_ejercicio3;

/**
 *
 * @author Fernando
 */
public class EmpleadoTemporal extends Empleado {
    private double valorHora;
    private double hsTrabajadas;

    public EmpleadoTemporal(double valorHora, double hsTrabajadas, String nombre) {
        super(nombre);
        this.valorHora = valorHora;
        this.hsTrabajadas = hsTrabajadas;
    }
    
    @Override
    public double calcularSueldo() {
        return valorHora * hsTrabajadas;
    }
    
}
