package tp3;

/**
 *
 * @author Fernando
 */

/*
4. Gestión de Gallinas en Granja Digital
a. Crear una clase Gallina con los atributos: idGallina, edad,
huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
*/
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public void ponerHuevo(){
        huevosPuestos++;
    }
    
    public void envejecer(){
        edad++;
    }
    
    public void mostrarEstado(){
        System.out.println("Edad de la gallina: " + edad + "\nHuevos puestos: " + huevosPuestos);
    }
    
}
