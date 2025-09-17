package tp5_ejercicio1;

/**
 *
 * @author Fernando
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Titular titular; //Asociacion bidireccional, Pasaporte tiene un titular y Titular tiene un pasaporte
    private Foto foto;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); /*Relacion de Composicion, cuando se destruye el objeto pasaporte
                                                se destruye la referencia a la foto*/
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public Foto getFoto() {
        return foto;
    }

    
    
    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", titular=" + titular.getNombre() + ", foto=" + foto + '}';
    }
    
    
    
    
}
