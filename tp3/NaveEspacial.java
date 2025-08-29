package tp3;

/**
 *
 * @author Fernando
 */

/*
5. Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia),
recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que
se supere el límite al recargar.
*/
public class NaveEspacial {
    private String nombre;
    private int combustible;
    
    public void despegar(){
        if(combustible >= 10){
            combustible -= 10;
        }
    }
    
    public void setCombustible(int cantidad){
        if(cantidad > 0 && (combustible + cantidad) <= 100){
            combustible += cantidad;
        }
    }
    
    public void avanzar(){
        if(combustible >= 10){
            combustible -= 10;
        }
    }
    
    public void recargarCombustible(int cantidad){
        int capacidadMaxima = 100;
        if((combustible + cantidad) <= capacidadMaxima && cantidad > 0){
            combustible += cantidad;
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre de la nave: " + nombre + "\nCombustible: " + combustible);
    }
    
    
}
