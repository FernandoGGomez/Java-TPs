package tp8_ejercicio2.calsesQuePuedenArrojarExcepciones;

/**
 *
 * @author Fernando
 */
public class ValidadorEdad {
    public static void validarEdad(int edad){
        if(edad < 0 || edad > 120){
            throw new EdadInvalidaException("Edad fuera del rango 0-120");
        
        }
    
    }
}
