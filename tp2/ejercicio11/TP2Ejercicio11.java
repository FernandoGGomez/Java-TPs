package tp2.ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
/*
Funciones:
11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
método calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 200
El descuento especial aplicado es: 20.0
El precio final con descuento es: 180.0
*/
public class TP2Ejercicio11 {
    static double variable_global = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        double precio;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        calcularDescuentoEspecial(precio);
        
        
    }
    
    static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado, descuentoEspecial;
    
        descuentoEspecial = precio * variable_global;
    
        descuentoAplicado = precio - descuentoEspecial;
    
        System.out.println("El descuento especial aplicado es: " + descuentoEspecial);
        System.out.println("El precio final con descuento es: " + descuentoAplicado);
    
    }
}
