package tp8_ejercicio1.clases;

import java.util.ArrayList;
import java.util.List;
import tp8_ejercicio1.interfaces.Notificable;
import tp8_ejercicio1.interfaces.Pago;

/**
 *
 * @author Fernando
 */
public class Cliente implements Notificable{
    
    private List<Pago> metodosDePago;  

    public Cliente() {
        this.metodosDePago = new ArrayList<>();  // Inicializa la lista
    }

    @Override
    public void notificacion(String estado) {
        System.out.println("Estado del pedido actualizado");
        System.out.println("Estado actual: " + estado);
    }

    public void setMetodosDePago(Pago metodoDePago) {
        this.metodosDePago.add(metodoDePago);
    }
    
    public void pagarConPayPal(double monto){
        for (Pago metodo : metodosDePago) {
            if(metodo instanceof PayPal) { 
            PayPal paypal = (PayPal) metodo;  
            paypal.procesarPago(monto);  
            return;  
        }
        }
    }
    
    public void pagarConTarjetaDeCredito(double monto){
        for (Pago metodo : metodosDePago) {
            if(metodo instanceof TarjetaCredito) { 
            TarjetaCredito tc = (TarjetaCredito) metodo;  
            tc.procesarPago(monto);  
            return;  
        }
        }
    }
    
}
