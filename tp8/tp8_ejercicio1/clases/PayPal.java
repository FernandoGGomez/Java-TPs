package tp8_ejercicio1.clases;

import tp8_ejercicio1.interfaces.PagoConDescuento;

/**
 *
 * @author Fernando
 */
public class PayPal implements PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Monto: $" + monto + ",Metodo de pago: PayPal" );
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando un descuento de " + porcentaje + "%");
    }
        
}
