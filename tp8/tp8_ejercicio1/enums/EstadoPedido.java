package tp8_ejercicio1.enums;

/**
 *
 * @author Fernando
 */
public enum EstadoPedido {
    EN_PREPARACION("En preparacion"),
    EN_CAMINO("En camino"),
    ENTREGADO("Entregado");
    
    private String estado;

    private EstadoPedido(String estado) {
        this.estado = estado;
    }
    
    public String getEstado(){
        return estado;
    }
    
}
