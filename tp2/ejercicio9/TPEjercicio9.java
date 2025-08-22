/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
/*
Funciones:
9. Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0
*/
public class TPEjercicio9 {
    static final double COSTO_KILO_NACIONAL = 5;
    static final double COSTO_KILO_INTERNACIONAL = 10;
    
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        double precioProducto, pesoPaquete, costoEnvio,totalCompra;
        String zona;
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        pesoPaquete = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        zona = input.nextLine();
        
        costoEnvio = calcularCostoEnvio(pesoPaquete, zona);
        
        totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
         
         System.out.println("El costo de envio es: $" + costoEnvio);
         System.out.println("El total a pagar es: $" + totalCompra);
     }
     
    static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio = 0;
        
        switch (zona) {
            case "nacional":
            case "Nacional":
            case "NACIONAL":    
                costoEnvio = peso * COSTO_KILO_NACIONAL;
                break;
                
            case "internacional":
            case "Internacional":
            case "INTERNACIONAL":
                costoEnvio = peso * COSTO_KILO_INTERNACIONAL;
                break;
        }
    
        return costoEnvio;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double totalCompra = 0;
        
        totalCompra = precioProducto + costoEnvio;
        
        return totalCompra;
    
    
    }
}
