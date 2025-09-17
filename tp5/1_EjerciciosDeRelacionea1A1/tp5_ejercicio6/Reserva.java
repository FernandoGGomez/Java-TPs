package tp5_ejercicio6;

/**
 *
 * @author Fernando
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;//Asociacion unidireccional
    private Mesa mesa;//Relacion de Agregacion

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" + "fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", mesa=" + mesa + '}';
    }
}
