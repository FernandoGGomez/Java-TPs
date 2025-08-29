/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Fernando
 */
/*
1. Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso,
calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos),
bajarCalificacion(puntos).
*/
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre  + "\nApellido: " + apellido + "\nCurso: " + curso + "\nCalificacion: " + calificacion );
    }
    
    public void subirCalificacion(double puntos){
        calificacion += puntos;
    }
    
    public void bajarCalificacion(double puntos){
        calificacion -= puntos;
    }
}
