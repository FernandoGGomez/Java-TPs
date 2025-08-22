
package tp2.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */

/*
Estructuras Condicionales:
4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final
Ejemplo de entrada/salida:
Ingrese el precio del producto: 1000
Ingrese la categoría del producto (A, B o C): B
Descuento aplicado: 15%
Precio final: 850.0
*/
public class TP2Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio, precio_final;
        char categoria;
        
        System.out.print("Ingrese el precio del producto: $");
        precio = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        categoria = input.nextLine().charAt(0);
        
        switch(categoria){        
            case 'A':
            case 'a':
                precio_final = precio - (precio * 0.10);
                System.out.println("Descuento aplicado: 10%");
                System.out.println("Precio final: $" + precio_final);
                break;
            
            case 'B':
            case 'b':
                precio_final = precio - (precio * 0.15);
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio final: $" + precio_final);
            
                break;
                    
            case 'C':
            case 'c':
                precio_final = precio - (precio * 0.20);
                System.out.println("Descuento aplicado: 20%");
                System.out.println("Precio final: $" + precio_final);
            
                break;
                    
            default:
                System.out.println("Ingrese una opcion valida");
        }
            
           
               
            
    }
    
}
