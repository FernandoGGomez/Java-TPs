package tp8_ejercicio2.calsesQuePuedenArrojarExcepciones;

/**
 *
 * @author Fernando
 */
public class EdadInvalidaException extends RuntimeException{

    public EdadInvalidaException() {
    }

    public EdadInvalidaException(String message) {
        super(message);
    }

    public EdadInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }

    public EdadInvalidaException(Throwable cause) {
        super(cause);
    }
    
    
}
