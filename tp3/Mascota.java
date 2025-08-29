package tp3;

/**
 *
 * @author Fernando
 */

/*
2. Registro de Mascotas
a. Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
*/
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad );
        
    }
    
    void cumplirAnios(){
        edad++;
    }
}
