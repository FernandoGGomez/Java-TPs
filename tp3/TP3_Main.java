package tp3;

/**
 *
 * @author Fernando
 */
public class TP3_Main {

    public static void main(String[] args) {
        /*Ejercicio 1. Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir
calificaciones*/
        System.out.println("Ejercicio 1:");
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.nombre = "Fernando";
        estudiante1.apellido = "Gomez";
        estudiante1.curso = "Programacion 2";
        estudiante1.calificacion = 8;
        
        
        estudiante1.mostrarInfo();
        System.out.println("------------------");
        estudiante1.subirCalificacion(5);
        estudiante1.mostrarInfo();
        System.out.println("------------------");
        estudiante1.bajarCalificacion(3);
        estudiante1.mostrarInfo();
        
        System.out.println("");

        System.out.println("******************************\n");
        
        /*Ejercicio 2. Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y
verificar los cambios.*/
        System.out.println("Ejercicio 2:");
        
        Mascota mascota1 = new Mascota();
        
        mascota1.nombre = "Bunky";
        mascota1.especie = "Chiguagua";
        mascota1.edad = 3;
        
        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        mascota1.cumplirAnios();
        System.out.println("------------------");
        mascota1.mostrarInfo();
        
        System.out.println("");

        System.out.println("******************************\n"); 
        
        /*Ejercicio 3. Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
uno válido, mostrar la información final.*/
        System.out.println("Ejercicio 3:");
        
        Libro libro1 = new Libro();
        
        libro1.setAnioPublicacion(3035); //valor inválido
        System.out.println("Anio de publicacion: " + libro1.getAñoPublicacion());
        System.out.println("------------------");
        libro1.setAnioPublicacion(2018); //valor válido
        System.out.println("Anio de publicacion: " + libro1.getAñoPublicacion());
        
        System.out.println("");

        System.out.println("******************************\n");
        
        /*Ejercicio 4. Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y
mostrar su estado.*/
        System.out.println("Ejercicio 4:");
        
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        System.out.println("Gallina 1: ");
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.mostrarEstado();
        System.out.println("");
        System.out.println("Gallina 2: ");
        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.mostrarEstado();
        
        System.out.println("");

        System.out.println("******************************\n");
        
        /*Ejercicio 5. Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin
recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.*/
        System.out.println("Ejercicio 5:");
        
        NaveEspacial nave1 = new NaveEspacial();
        
        nave1.setCombustible(50);
        nave1.avanzar();
        nave1.mostrarEstado();
        System.out.println("------------------");
        nave1.recargarCombustible(60);
        nave1.avanzar();
        nave1.mostrarEstado();
    }
    
   
}
