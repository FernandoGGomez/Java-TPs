package tp7_ejercicio3;

/**
 *
 * @author Fernando
 */
public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    
    public abstract double calcularSueldo();
}
