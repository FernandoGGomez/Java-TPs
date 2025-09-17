package tp5_ejercicio7;

/**
 *
 * @author Fernando
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;//Asociacion bidireccional

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if(vehiculo != null & vehiculo.getConductor() != this){
            vehiculo.setConductor(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + 
                licencia + ", patente_vehiculo=" + vehiculo.getPatente() + '}';
    }
}
