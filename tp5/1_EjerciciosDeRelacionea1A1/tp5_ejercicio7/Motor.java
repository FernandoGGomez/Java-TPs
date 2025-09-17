package tp5_ejercicio7;

/**
 *
 * @author Fernando
 */
public class Motor {
    private String tipo;
    private String modelo;

    public Motor(String tipo, String modelo) {
        this.tipo = tipo;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", modelo=" + modelo + '}';
    }
    
    
}
