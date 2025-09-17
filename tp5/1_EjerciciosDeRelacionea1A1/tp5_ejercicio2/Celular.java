package tp5_ejercicio2;

/**
 *
 * @author Fernando
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; //Asociacion unidireccional
    private Usuario usuario; //Asociacion bidireccional

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    
    public Usuario getUsuario() {
        return usuario;
    }    

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }
    
    
}
