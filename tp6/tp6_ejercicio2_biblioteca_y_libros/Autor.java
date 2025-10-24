package tp6_ejercicio2_biblioteca_y_libros;

/**
 *
 * @author Fernando
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    
    public Autor(String id, String nombre, String nacionalidad){
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("----------------------------------------------------");
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
