package tp2.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
/*
Funciones:
10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.
Ejemplo de entrada/salida:
Ingrese el stock actual del producto: 50
Ingrese la cantidad vendida: 20
Ingrese la cantidad recibida: 30
El nuevo stock del producto es: 60
*/
public class TP2Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;
        
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock;
        
        return nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
    }
     
}
