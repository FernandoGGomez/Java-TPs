package tp5_ejercicio13;

/**
 *
 * @author Fernando
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario;//Asociacion Unidireccional

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }  
    
}
