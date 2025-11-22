package tp8_ejercicio1.clases;

import tp8_ejercicio1.interfaces.PagoConDescuento;

/**
 *
 * @author Fernando
 */
public class TarjetaCredito implements PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Monto: $" + monto + ",Metodo de pago: Tarjeta de Credito" );
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Aplicando un descuento de " + porcentaje + "%");
    }
    
}
