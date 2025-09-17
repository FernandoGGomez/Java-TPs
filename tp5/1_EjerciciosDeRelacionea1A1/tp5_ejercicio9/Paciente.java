package tp5_ejercicio9;

/**
 *
 * @author Fernando
 */
public class Paciente {
    private String nombre;
    private String dni;

    public Paciente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
}
