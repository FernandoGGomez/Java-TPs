package tp8_ejercicio2.calsesQuePuedenArrojarExcepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Fernando
 */
public class LectorDeArchivo {
     
    public static void leerArchivo(String ruta) throws FileNotFoundException, IOException{
        File archivo = new File(ruta);
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        System.out.println("Archivo: " + br.readLine());
        br.close();
    }
        
        
}
