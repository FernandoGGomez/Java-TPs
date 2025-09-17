package tp5_ejercicio4;

/**
 *
 * @author Fernando
 */
public class Cliente {
    private String numero;
    private String dni;
    private TarjetaDeCredito tarjetaDeCredito;//Asociacion bidireccional

    public Cliente(String numero, String dni) {
        this.numero = numero;
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if(tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this){
            tarjetaDeCredito.setCliente(this);
        }
    }

    public String getDni() {
        return dni;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "numero=" + numero + ", dni=" + dni + ", tarjetaDeCredito=" + tarjetaDeCredito + '}';
    }
    
}
