package tp7_ejercicio1;

import java.util.ArrayList;
import tp7_ejercicio2.Circulo;
import tp7_ejercicio2.Rectangulo;
import tp7_ejercicio3.Empleado;
import tp7_ejercicio3.EmpleadoPlanta;
import tp7_ejercicio3.EmpleadoTemporal;
import tp7_ejercicio4.Animal;
import tp7_ejercicio4.Gato;
import tp7_ejercicio4.Perro;
import tp7_ejercicio4.Vaca;

/**
 *
 * @author Fernando
 */
public class TP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto(5, "Fiat", "Siena");
        
        auto1.mostrarInfo();
        
        Rectangulo r1 = new Rectangulo(5, 4, "Rectangulo");
        Circulo c1 = new Circulo(6, "Circulo");
        
        System.out.println("Area Rectangulo: " + r1.calcularArea());
        System.out.println("Area Circulo: " + c1.calcularArea());
        
        
        System.out.println("EMPLEADOS");
        
        EmpleadoPlanta e1 = new EmpleadoPlanta(100000, "Juan");
        EmpleadoPlanta e2 = new EmpleadoPlanta(120000, "Pedro");
        EmpleadoPlanta e3 = new EmpleadoPlanta(130000, "Jose");
        
        EmpleadoTemporal eT1 = new EmpleadoTemporal(5000, 28, "Antonio");
        EmpleadoTemporal eT2 = new EmpleadoTemporal(5000, 17, "Ramiro");
        EmpleadoTemporal eT3 = new EmpleadoTemporal(5000, 15, "Fernando");
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        
        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        
        listaEmpleados.add(eT1);
        listaEmpleados.add(eT2);
        listaEmpleados.add(eT3);
        
        
        
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Empleado: " + empleado.getNombre() + "\nSueldo: $" + empleado.calcularSueldo());
            if(empleado instanceof EmpleadoPlanta){
                System.out.println( "Empleado de planta");
                System.out.println("------------------------------------");
            }else{
                System.out.println( "Empleado temporal");
                System.out.println("------------------------------------");
            }
        }
     
        Perro p1 = new Perro();
        Gato g1 = new Gato();
        Vaca v1 = new Vaca();
        
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        
        listaAnimales.add(p1);
        listaAnimales.add(g1);
        listaAnimales.add(v1);
        
        for (Animal animal : listaAnimales) {
            animal.hacerSonido();
        }
        
    }
    
}
