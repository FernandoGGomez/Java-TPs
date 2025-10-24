package tp6_ejercicio2_biblioteca_y_libros;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class TP6_Ejercicio2_Biblioteca_y_Libros {

    public static void main(String[] args) {
       
        // 1.Creamos una biblioteca. 
        
        Biblioteca biblioteca = new Biblioteca();


        // 2.Crear al menos tres autores 
        Autor autor1 = new Autor("1", "Jorge Luis Borges", "Argentino");
        Autor autor2 = new Autor("2", "Julio Cortazar", "Argentino");
        Autor autor3 = new Autor("3", "Gabriel Garcia Marquez", "Colombiano");
        
        

        



        // 3.Agregar 5 libros asociados a alguno de los Autores a la biblioteca. 
        biblioteca.agregarLibro("978-8497598308", "Ficciones", 1944, autor1);
        biblioteca.agregarLibro("978-8437603769", "El Aleph", 1949, autor1);
        biblioteca.agregarLibro("978-9876296923", "Rayuela", 1963, autor2);
        biblioteca.agregarLibro("978-8437603493", "Bestiario", 1951, autor2);
        biblioteca.agregarLibro("978-0307382510", "Cronica de una muerte anunciada", 1981, autor3);
        

        // 4.Listar todos los libros con su información y la del autor. 
        System.out.println("Lista de todos los libros:");
        biblioteca.listarLibros();


        System.out.println("///////////////////////////////////////////////////////////");


        // 5.Buscar un libro por su ISBN y mostrar su información. 
        System.out.println("Buscar libro por Isbn:");
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn("978-9876296923"); 
        if(libroEncontrado != null){
            libroEncontrado.mostrarInfo();
        }else{
            System.out.println("No existe un libro con ese Isbn");
        }

        System.out.println("///////////////////////////////////////////////////////////");

        // 6.Filtrar y mostrar los libros publicados en un año específico. 
        final int ANIO_LANZAMIENTO = 1944;
        System.out.println("Filtrar libros por anio de lanzamiento "+ ANIO_LANZAMIENTO + ":");
        biblioteca.filtrarLibrosPorAnio(ANIO_LANZAMIENTO);
   

        System.out.println("///////////////////////////////////////////////////////////");
      


        // 7.Eliminar un libro por su ISBN y listar los libros restantes. 
        System.out.println("Eliminar un libro por ISBN y listar los restantes");
        biblioteca.eliminarLibro("978-8497598308");


        System.out.println("///////////////////////////////////////////////////////////");


        // 8.Mostrar la cantidad total de libros en la biblioteca. 
        System.out.println("Mostrar la cantidad total de libros en la biblioteca:");
        biblioteca.obtenerCantidadLibros();
        

        System.out.println("///////////////////////////////////////////////////////////");



        // 9.Listar todos los autores de los libros disponibles en la biblioteca. 
        System.out.println("Autores disponibles:");
        biblioteca.mostrarAutoresDisponibles();





    }
    
}
