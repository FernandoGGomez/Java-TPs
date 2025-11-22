package tp8_ejercicio1;

import tp8_ejercicio1.clases.Cliente;
import tp8_ejercicio1.clases.PayPal;
import tp8_ejercicio1.clases.Pedido;
import tp8_ejercicio1.clases.Producto;
import tp8_ejercicio1.clases.TarjetaCredito;
import tp8_ejercicio1.enums.EstadoPedido;

/**
 *
 * @author Fernando
 */
public class TP8Ejercicio1 {

  
    public static void main(String[] args) {
        Producto prod1 = new Producto("Telefono", 240000);
        Producto prod2 = new Producto("Pantalon", 30000);
        Producto prod3 = new Producto("Remera", 10000);
        Producto prod4 = new Producto("Funda telefono", 12000);
    
        TarjetaCredito tc = new TarjetaCredito();
        PayPal paypal = new PayPal();
        
        Cliente cliente = new Cliente();
        cliente.setMetodosDePago(tc);
        cliente.setMetodosDePago(paypal);
        
        
        Pedido pedido = new Pedido(cliente);
        System.out.println("Pedido:"); 
        pedido.agregarProducto(prod1);
        pedido.agregarProducto(prod2);
        pedido.agregarProducto(prod3);
        pedido.agregarProducto(prod4);
        
        System.out.println(pedido.getProductos());
        
        System.out.println("");
        
        System.out.println("El total del pedido es de: $" + pedido.calcularTotal());
        
        System.out.println("");
        
        System.out.println("Estado del pedido: " + pedido.getEstado());
        
        
        double monto =  pedido.calcularTotal();
        
        System.out.println("");
        
        System.out.println("Pagando");
        cliente.pagarConPayPal(monto);
        
        pedido.cambiarEstado(EstadoPedido.EN_CAMINO);
   
        
        System.out.println("");
        
        pedido.cambiarEstado(EstadoPedido.ENTREGADO);
     
        
    
    }
    
}
