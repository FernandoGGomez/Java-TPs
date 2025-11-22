package tp8_ejercicio1.clases;

import java.util.ArrayList;
import tp8_ejercicio1.interfaces.Pagable;
import tp8_ejercicio1.clases.Producto;
import java.util.List;
import tp8_ejercicio1.enums.EstadoPedido;
import tp8_ejercicio1.interfaces.Notificable;

/**
 *
 * @author Fernando
 */
public class Pedido implements Pagable{
    private List<Producto> productos;
    private Notificable cliente;
    private EstadoPedido estado;

    public Pedido(Notificable cliente) {
        this.productos = new ArrayList<Producto>();
        this.cliente = cliente;
        this.estado = estado.EN_PREPARACION;
    }

    public String getEstado() {
        return estado.getEstado();
    }

    
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }
    
    
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
        
    }
    
    public void cambiarEstado(EstadoPedido nuevoEstado){
        this.estado = nuevoEstado;
        cliente.notificacion(estado.getEstado());
    }
    
}
