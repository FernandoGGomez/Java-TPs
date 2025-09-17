package tp5_ejercicio7;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio7 {
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Juan", "B2");
        Motor motor = new Motor("Naftero", "2019");
        Vehiculo auto = new Vehiculo("ABC123", "2019", motor);
        
        conductor.setVehiculo(auto);
        
        System.out.println("Auto: " + auto);
        System.out.println("Conductor: " + conductor);

    }    
}
