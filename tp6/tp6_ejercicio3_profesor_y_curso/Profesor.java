package tp6_ejercicio3_profesor_y_curso;

import java.util.ArrayList;


/**
 *
 * @author Fernando
 */
public class Profesor {
    String id; 
    String nombre;
    String especialidad; 
    ArrayList<Curso> cursos = new ArrayList<>();
    
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Curso> getCursos(){
        return this.cursos;
    }
    
    public void agregarCurso(Curso c){
        if(this.cursos.contains(c)){
             return;
         }
        if(c != null){
            this.cursos.add(c);
            if(c.getProfesor() != this){
                c.setProfesor(this);
            }
        }
       
    
    }
    
    public void eliminarCurso(Curso c){
        boolean eliminado = this.cursos.remove(c);
        if(eliminado){
            c.setProfesor(null);
        }
        
        
    } 
    
    
    public void listarCursos() {
        System.out.println("Lista de Cursos:");
        for (Curso curso : cursos) {
            curso.mostrarInfoParaProfesor();
            System.out.println("---------------------------------------");
        }
        
    }
    
    
    public void mostrarInfo(){
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        if(!cursos.isEmpty()){
            System.out.println("Cantidad de cursos: " + this.cantidadCursos());
        }
    }
    

    public String getNombre() {
        return nombre;
    }

    public int cantidadCursos(){
        return this.cursos.size();
    }
    
}
