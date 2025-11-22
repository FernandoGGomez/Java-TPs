package tp8_ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import tp8_ejercicio2.calsesQuePuedenArrojarExcepciones.EdadInvalidaException;
import tp8_ejercicio2.calsesQuePuedenArrojarExcepciones.LectorDeArchivo;
import tp8_ejercicio2.calsesQuePuedenArrojarExcepciones.ValidadorEdad;

/**
 *
 * @author Fernando
 */
public class TP8Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //1. Division segura
        System.out.println("#1. Division segura");
        
        System.out.print("Ingrese el dividendo:");
        int n1 = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese el divisor:");
        int n2 = Integer.parseInt(scanner.nextLine());
    
        System.out.println("Numero 1: " + n1);
        System.out.println("Numero 2: " + n2);
        try{
            int resultado = n1 / n2;
            System.out.println("Resultado: " + resultado);
        
        }catch(ArithmeticException ae){
        
            System.err.println("Error: No se puede dividir por 0");
        }  
        
        System.out.println("");
        
        //2. Conversion de cadena a numero
         
        System.out.println("#2. Conversion de cadena a numero  ");
        
        System.out.print("Ingrese un texto:");
        String texto = scanner.nextLine();
       
        try{
            int textoAInt = Integer.parseInt(texto);
            System.out.println("Texto a entero: " + textoAInt);
        
        }catch(NumberFormatException  nfe){
        
            System.err.println("Error: No se pueden convertir caracteres no numericos a entero");
        }  
        
        System.out.println("");
        
        
        //3. Lectura de archivo  
        System.out.println("3. Lectura de archivo  "); 

       try {
            
           LectorDeArchivo.leerArchivo("rutaErronea");
       
       }catch(FileNotFoundException fnfe){
           System.err.println("Error: Archivo no encontrado");
       }catch(IOException ioe){
           System.err.println("Error de E/S: " + ioe.getMessage());
       }
       
        System.out.println("");
        
        
        //4. Excepción personalizada   
        System.out.println("4. Excepcion personalizada");
        System.out.print("Ingrese una edad entre 0 y 120 anios:");
        int edad = Integer.parseInt(scanner.nextLine());
       
        try{
            ValidadorEdad.validarEdad(edad);
        }catch(EdadInvalidaException eie){
           System.err.println("Error: " + eie.getMessage());
       }
        
        System.out.println("");
        
        //5. Uso de try-with-resources  
       System.out.println("5. Uso de try-with-resources");
       File archivo = new File("rutaErronea");
       try(BufferedReader br = new BufferedReader(new FileReader(archivo));){
            System.out.println("Archivo: " + br.readLine());
       }catch(FileNotFoundException fnfe){
            System.err.println("Error: Archivo no encontrado");
       }catch(IOException ioe){
            System.err.println("Error de E/S: " + ioe.getMessage());
       }
       
    }
    
}
