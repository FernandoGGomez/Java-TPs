package tp2.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */

/*
Funciones:
8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
Ejemplo de entrada/salida:
Ingrese el precio base del producto: 100
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0
*/
public class TP2Ejercicio8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        double precioBase, impuesto, descuento, precioFinal;
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = Double.parseDouble(input.nextLine()) / 100; //Lo divido por 100 para convertirlo en 0.xx
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = Double.parseDouble(input.nextLine()) / 100;
              
        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
         System.out.println("El precio final del producto es: " + precioFinal);
        
     }
     
     static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
         System.out.println("Precio base: " + precioBase);
         System.out.println("impuesto: "+ impuesto);
         System.out.println("descuento: " + descuento);
         double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
         return precioFinal;
     }
}
