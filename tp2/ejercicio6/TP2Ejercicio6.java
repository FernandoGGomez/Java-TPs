package tp2.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */

/*
Estructuras de Repetición:
6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
Ejemplo de entrada/salida:
Ingrese el número 1: -5
Ingrese el número 2: 3
Ingrese el número 3: 0
Ingrese el número 4: -1
Ingrese el número 5: 6
Ingrese el número 6: 0
Ingrese el número 7: 9
Ingrese el número 8: -3
Ingrese el número 9: 4
Ingrese el número 10: -8
Resultados:
Positivos: 4
Negativos: 4
Ceros: 2
*/
public class TP2Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, positivos = 0, negativos = 0, ceros = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero: ");
            numero = Integer.parseInt(input.nextLine());
            
            if(numero > 0){
                positivos++;
            }else if(numero < 0){
                negativos++;
            }else{
                ceros++;
            }
            
        }
        
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

    }
    
}
