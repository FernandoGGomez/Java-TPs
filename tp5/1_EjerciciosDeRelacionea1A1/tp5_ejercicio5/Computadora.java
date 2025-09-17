package tp5_ejercicio5;

/**
 *
 * @author Fernando
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;//Asociacion bidireccional
    private PlacaMadre placaMadre;//Relacion de Composicion

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario != null & propietario.getComputadora()!= this){
            propietario.setComputadora(this);
        }
    }

    public String getSpecs(){
        return "{marca= " + marca + ", Placa Madre= " + placaMadre + "}";
    }
    
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", DNI_propietario=" + propietario.getDni() + ", placaMadre=" + placaMadre + '}';
    }
    
    
}
