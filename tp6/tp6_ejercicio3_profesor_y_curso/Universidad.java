package tp6_ejercicio3_profesor_y_curso;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    
    public void agregarProfesor(Profesor p){
        this.profesores.add(p);
        
    } 
    
    public void agregarCurso(Curso c){
        this.cursos.add(c);
    
    } 
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Curso curso = this.buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = this.buscarProfesorPorId(idProfesor);
        
        curso.setProfesor(profesor);
        
        
    } 
    
    
    public Curso buscarCursoPorCodigo(String codigo){
        Curso cursoEncontrado = null;
        int i = 0;
        while(i < cursos.size() && !this.cursos.get(i).getCodigo().equalsIgnoreCase(codigo)){
            i++;
        }
        if(i < cursos.size()){
            cursoEncontrado = this.cursos.get(i);
        }
        
        return cursoEncontrado;
        
    } 

    public Profesor buscarProfesorPorId(String id){
        Profesor profesorEncontrado = null;
        int i = 0;
        while(i < profesores.size() && !this.profesores.get(i).getId().equalsIgnoreCase(id)){
            i++;
        }
        if(i < profesores.size()){
            profesorEncontrado = this.profesores.get(i);
        }
        return profesorEncontrado;
    } 
    
    public void listarProfesores(){
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
            profesor.listarCursos();
        }
    } 
    
    public void listarCursos(){
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    } 
    
    public void eliminarCurso(String codigo){
        Curso curso = this.buscarCursoPorCodigo(codigo);
        if(curso != null && this.cursos.contains(curso)){ // Si existe el curso que se quiere eliminar
            if(curso.getProfesor() != null){// antes de eliminarlo, se setea su profesor en null
               curso.setProfesor(null);//para que su profesor pierda su referencia al curso eliminado
            }
        
        }
        this.cursos.remove(curso);
    }
     
    public void eliminarProfesor(String id){
        Profesor profesor = this.buscarProfesorPorId(id);
        if(profesor != null && this.profesores.contains(profesor)){
            if(!profesor.getCursos().isEmpty()){
                ArrayList<Curso> cursosProfesor = profesor.getCursos();
                final int CANT_CURSOS_PROFESOR = cursosProfesor.size();
                int i = 0;
                while(i < CANT_CURSOS_PROFESOR){
                    //Como el size va variando a medida que elimino los cursos,
                    //de esta forma, con el get siempre en el primer elemento, me 
                    //aseguro de eliminar todos y que el bucle no se saltee ninguno
                    cursosProfesor.get(0).setProfesor(null); 
                    i++;
                }
            }
        }
        
        profesores.remove(profesor);
        
    }
    
    public void cantidadDeCursosProfesor(){
        for (Profesor profesor : profesores) {
            System.out.println("Profesor: " + profesor.getNombre());
            System.out.println("Cantidad de cursos: " + profesor.cantidadCursos());
        
    
        }
    }
    
}
