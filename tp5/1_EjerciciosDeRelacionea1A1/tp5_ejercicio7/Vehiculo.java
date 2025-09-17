package tp5_ejercicio7;

/**
 *
 * @author Fernando
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Conductor conductor;//Asociacion bidireccional
    private Motor motor;//Relacion de Agregacion

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if(conductor != null & conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", conductor=" + conductor.getNombre() + ", motor=" + motor + '}';
    }
}
