package tp6_ejercicio2_biblioteca_y_libros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    
    public Biblioteca(){
        this.libros = new ArrayList<Libro>();
    }
    
    
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    } 
    
    public void listarLibros(){
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    public Libro buscarLibroPorIsbn(String isbn){
        Libro libroEncontrado = null;
        int i = 0;
        while(i < libros.size() && !this.libros.get(i).getIsbn().equalsIgnoreCase(isbn)){
            i++;
        }
        if(i < libros.size()){
            libroEncontrado = this.libros.get(i);
        }
        
        return libroEncontrado;
        
    } 
   
    public void filtrarLibrosPorAnio(int anio){
        ArrayList<Libro> librosPorAnio = new ArrayList<>(); 
        for (Libro libro : libros) {
            if(libro.getAnioPublicacion() == anio){
                librosPorAnio.add(libro);
            }
        }
        
        if(!librosPorAnio.isEmpty()){
            for (Libro libro : librosPorAnio) {
                System.out.println("Libro: " + libro.getTitulo() + " de " + libro.getAutor().getNombre());  
                
            }
        }else{
            System.out.println("No hay disponibles libros lanzados en esa fecha");
        }
        
    } 
 
            
    public void eliminarLibro(String isbn){
       Libro libroAEliminar = this.buscarLibroPorIsbn(isbn);
       this.libros.remove(libroAEliminar);
       this.listarLibros();
    
    }
    
    public void obtenerCantidadLibros(){
        int cantidadLibros = this.libros.size();
        System.out.println("Cantidad de libros disponibles: " + cantidadLibros);
    }
            
            
    public void mostrarAutoresDisponibles(){
        ArrayList<Autor> autoresDisponibles = new ArrayList<>(); 
        int i = 0;
        while(i < libros.size()){
            if(!autoresDisponibles.contains(libros.get(i).getAutor())){ /*Si la lista no contiene al autor lo agrego, si no no*/
                autoresDisponibles.add(libros.get(i).getAutor());        /*Esto es para que no se repitan los autores*/
                System.out.println(libros.get(i).getAutor().getNombre());
            }
            i++;
        } 
    }
    
}
