
package tp2.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */

/*
Estructuras de Repetición:
7. Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.
Ejemplo de entrada/salida:
Ingrese una nota (0-10): 15
Error: Nota inválida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): -2
Error: Nota inválida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): 8
Nota guardada correctamente.
*/
public class TP2Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        
        System.out.print("Ingrese una nota (0-10): ");
        nota = Integer.parseInt(input.nextLine());
        
        if (nota >= 0 && nota <= 10){
            System.out.println("Nota guardada correctamente.");
        }else{
            do {
            
            
            System.out.print("Error: Nota invalida. Ingrese una nota entre 0 y 10: ");
            nota = Integer.parseInt(input.nextLine());
            
            } while (nota < 0 || nota > 10);  
            
            System.out.println("Nota guardada correctamente.");
        }

        
        
    }
}
