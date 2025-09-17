package tp5_ejercicio1;

/**
 *
 * @author Fernando
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;//Asociacion bidireccional,Titular tiene un pasaporte y Pasaporte tiene un titular

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if(pasaporte != null && pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() {
        return this.pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", pasaporte=" + pasaporte + '}';
    }
    
    
    
}
