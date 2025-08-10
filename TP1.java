package tp1;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class TP1 {

    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner input = new Scanner(System.in);
        //double altura = 1.80;
        //boolean estudiant = true;
        
       /* 4:Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
        los muestre en pantalla. Usa Scanner para capturar los datos. */
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        
        /* 5: Escribe un programa que solicite dos números enteros y realice las siguientes
        operaciones:a. Suma
                    b. Resta
                    c. Multiplicación
                    d. División   
        Muestra los resultados en la consola.*/
        
        int n1, n2;
        
        System.out.print("Ingrese el primer número entero: ");
        n1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número entero: ");
        n2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Suma = " + (n1 + n2) );
        System.out.println("Resta = " + (n1 - n2) );
        System.out.println("Multiplicación = " + (n1 * n2) );
        System.out.println("División = " + (n1 / n2) );
        
        
        /* 6: Escribe un programa que muestre el siguiente mensaje en consola:
            Nombre: Juan Pérez
            Edad: 30 años
            Dirección: "Calle Falsa 123"
            Usa caracteres de escape (\n, \") en System.out.println().*/
        System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");
        
        
        /*8: Manejar conversiones de tipo y división en Java.
            a. Escribe un programa que divida dos números enteros ingresados por el
            usuario.
            b. Modifica el código para usar double en lugar de int y compara los
            resultados.*/
        //a
        int division;
        
        System.out.println("Division con int = " + (n1 / n2));
        System.out.println("Division con double = " + ((double)n1 / n2));
        
    }
    
}
