package tp5_ejercicio3;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio3 {
     public static void main(String[] args) {
        Editorial editorial = new Editorial("Sudamericana", "Humberto Primo 555, BS.AS.,Argentina");
        Autor autor = new Autor("Gabriel Garcia Marquez", "colombiano");
        Libro libro = new Libro("Cien anios de soledad", "9780060114183", editorial );
        
        System.out.println("Libro sin setear autor: " + libro);
         
        libro.setAutor(autor); 
        
        System.out.println("Libro con autor seteado: " + libro);

    }
}
