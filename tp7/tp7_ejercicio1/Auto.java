package tp7_ejercicio1;

/**
 *
 * @author Fernando
 */
public class Auto extends Vehiculo{
    private int cantidadPuertas;


    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: " + this.cantidadPuertas);;
    } 
}
