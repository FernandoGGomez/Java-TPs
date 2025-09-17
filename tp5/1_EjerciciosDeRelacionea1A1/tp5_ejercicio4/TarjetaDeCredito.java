package tp5_ejercicio4;

/**
 *
 * @author Fernando
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;//Asociacion bidireccional
    private Banco banco;//Relacion de Agregacion

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjetaDeCredito()!= this){
            cliente.setTarjetaDeCredito(this);
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", DNI_cliente=" + cliente.getDni() + ", banco=" + banco + '}';
    } 
    
}
