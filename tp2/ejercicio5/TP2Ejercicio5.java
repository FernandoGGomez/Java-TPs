package tp2.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */

/*
Estructuras de Repetición:
5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.
Ejemplo de entrada/salida:
Ingrese un número (0 para terminar): 4
Ingrese un número (0 para terminar): 7
Ingrese un número (0 para terminar): 2
Ingrese un número (0 para terminar): 0
La suma de los números pares es: 6
*/
public class TP2Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,suma_total = 0;
        
        System.out.print("Ingrese un numero (0 para terminar):");
        num = Integer.parseInt(input.nextLine());
        
        while(num != 0){
            if (num % 2 == 0){
                suma_total += num;
            }
            
            System.out.print("Ingrese un numero (0 para terminar):");
            num = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("La suma total es: " + suma_total);
        
    }
    
}
