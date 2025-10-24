package tp6_ejercicio3_profesor_y_curso;

/**
 *
 * @author Fernando
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void setProfesor(Profesor p){
         if(this.profesor == p){
              return;
         }
        
        if(this.profesor != null){
            this.profesor.eliminarCurso(this);
        }
        this.profesor = p;
        if(profesor != null && !profesor.getCursos().contains(this)){
            profesor.agregarCurso(this);
        }
       
        
    }

    public String getCodigo() {
        return codigo;
    }

    
    
    public Profesor getProfesor() {
        return profesor;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        if(profesor != null){
            System.out.println("Profesor: " + profesor.getNombre());
        }else{
            System.out.println("Profesor: Sin profesor asignado" );
        }
        System.out.println("-----------------------------------------------");
          
    }
    
        public void mostrarInfoParaProfesor(){ // Este es el método que va a usar el profesor cuando quiera información de sus cursos
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
          
    }
}
