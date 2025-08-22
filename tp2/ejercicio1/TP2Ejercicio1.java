package tp2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */

 /*
 Estructuras Condicionales:
  1. Verificación de Año Bisiesto.
 Escribe un programa en Java que solicite al usuario un año y determine si es
 bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
 divisible por 400.
 Ejemplo de entrada/salida:
 Ingrese un año: 2024
 El año 2024 es bisiesto.
 Ingrese un año: 1900
 El año 1900 no es bisiesto.
         */
public class TP2Ejercicio1 {

  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int anio;
        
        System.out.print("Ingrese un anio: ");
        anio = Integer.parseInt(input.nextLine());
        
        if(anio % 4 == 0){
            if(anio % 100 == 0){
                if(anio % 400 == 0){
                    //Si el año es divisible por 4, por 100 y por 400 es bisiesto
                    System.out.println("El anio " + anio + " es bisiesto.");
                }else{
                    System.out.println("El anio " + anio + " no es bisiesto.");

                }
            }else{
                //Si el año es divisible por 4 y no por 100 es bisiesto
                    System.out.println("El anio " + anio + " es bisiesto.");
                }
        }else{
            //Si el año no es divisible por 4 no es bisiesto
            System.out.println("El anio " + anio + " no es bisiesto.");
        }
        
    }
    
}
