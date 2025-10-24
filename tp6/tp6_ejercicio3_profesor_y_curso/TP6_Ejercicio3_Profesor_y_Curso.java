package tp6_ejercicio3_profesor_y_curso;

/**
 *
 * @author Fernando
 */
public class TP6_Ejercicio3_Profesor_y_Curso {
    
    public static void main(String[] args) {
        //1.Crear al menos 3 profesores y 5 cursos. 
        Profesor profesor1 = new Profesor("1", "Martin Lopez", "Matematica");
        Profesor profesor2 = new Profesor("2", "Ariel Castelli", "Bases de datos");
        Profesor profesor3 = new Profesor("3", "Maria Perez", "Programacion");
       
        Curso curso1 = new Curso("123q", "Bases de datos I");
        Curso curso2 = new Curso("543a", "Programacion II");
        Curso curso3 = new Curso("157g", "AySO");
        Curso curso4 = new Curso("234f", "Ingles");
        Curso curso5 = new Curso("875h", "Matematica");
        
        
        
        //2.Agregar profesores y cursos a la universidad. 
        
        Universidad u = new Universidad();
        
        u.agregarProfesor(profesor1);
        u.agregarProfesor(profesor2);
        u.agregarProfesor(profesor3);
        
        u.agregarCurso(curso1);
        u.agregarCurso(curso2);
        u.agregarCurso(curso3);
        u.agregarCurso(curso4);
        u.agregarCurso(curso5);
        
        
        
        //3.Asignar profesores a cursos usando asignarProfesorACurso(...). 
        u.asignarProfesorACurso("875h", "1");
        u.asignarProfesorACurso("875h", "1");
        u.asignarProfesorACurso("123q", "2");
        u.asignarProfesorACurso("543a", "3");
        u.asignarProfesorACurso("157g", "2");
        u.asignarProfesorACurso("234f", "3");
        
        
        
        
        //4.Listar cursos con su profesor y profesores con sus cursos. 
        System.out.println("Listado de cursos:");
        u.listarCursos();
        System.out.println("/////////////////////////////////////////////////////////");

        System.out.println("Listado de profesores:");
        u.listarProfesores();
        
          System.out.println("/////////////////////////////////////////////////////////");
     
        //5.Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("Listado de profesores despues de cambiar:");
        u.asignarProfesorACurso("123q", "3");
        u.listarProfesores();
        
        System.out.println("/////////////////////////////////////////////////////////");
        
        //6.Remover un curso y confirmar que ya no aparece en la lista del profesor. 
        System.out.println("Listado de profesores despues de eliminar un curso:");
        u.eliminarCurso("123q");
        u.listarProfesores();
        
        System.out.println("/////////////////////////////////////////////////////////");

        
        //7.Remover un profesor y dejar profesor = null
        System.out.println("Lista de cursos despues de eliminar un profesor: ");
        u.eliminarProfesor("3");
        u.listarCursos();
        System.out.println("Lista de profesores despues de eliminar un profesor: ");
        u.listarProfesores();
       
        System.out.println("/////////////////////////////////////////////////////////");

        //8. Mostrar un reporte: cantidad de cursos por profesor. 
        System.out.println("Cantidad de cursos por profesor:");
        u.cantidadDeCursosProfesor();
        
        
        

    }
    
}
