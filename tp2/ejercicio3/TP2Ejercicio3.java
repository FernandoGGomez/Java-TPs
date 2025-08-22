package tp2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */

/*
Estructuras Condicionales:
3. Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su
etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"
Ejemplo de entrada/salida:
Ingrese su edad: 25
Eres un Adulto.
Ingrese su edad: 10
Eres un Niño.
*/
public class TP2Ejercicio3 {
     
    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        int edad = 0;
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if(edad > 0 && edad < 12){
            
            System.out.println("Eres un Ninio");
            
        }else if(edad > 12 && edad <= 17){
            
            System.out.println("Eres un Adolescente");
            
        }else if(edad >= 18 && edad <= 59){
            
            System.out.println("Eres un Adulto");
            
        }else if(edad >= 60){
            
            System.out.println("Eres un Adulto mayor");
        
        }else{
            System.out.println("Ingrese una edad valida");
        }
        
     }
}
