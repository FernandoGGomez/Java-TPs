package tp5_ejercicio14;

/**
 *
 * @author Fernando
 */
public class Proyecto {
    private String nombre;
    private double duracionMin;

    public Proyecto(String nombre, double duracion) {
        this.nombre = nombre;
        this.duracionMin = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracionMin() {
        return duracionMin;
    }
    
    public void setDuracionMin(double duracionMin) {
        this.duracionMin = duracionMin;
    }
    
}
