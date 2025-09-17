package tp5_ejercicio5;

/**
 *
 * @author Fernando
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;//Asociacion bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if(computadora != null & computadora.getPropietario() != this){
            computadora.setPropietario(this);
        }
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + ", computadora= " + computadora.getSpecs() + '}';
    }
    
}
