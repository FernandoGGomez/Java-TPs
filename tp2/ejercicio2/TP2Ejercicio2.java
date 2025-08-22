package tp2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */

/*
Estructuras Condicionales:
2. Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor.
Ejemplo de entrada/salida:
Ingrese el primer número: 8
Ingrese el segundo número: 12
Ingrese el tercer número: 5
El mayor es: 12


*/
public class TP2Ejercicio2 {

 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, mayor;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());

                
        System.out.println("Ingrese el tercer numero: ");
        num3 = Integer.parseInt(input.nextLine());
        
        if(num1 >= num2 && num1 >= num3){
            
            mayor = num1;
            
        }else if(num2 >= num3){
            
            mayor = num2;
            
        }else{
            
            mayor = num3;
            
        }
    
        System.out.println("El mayor es: " + mayor);
        
    }
    
}
