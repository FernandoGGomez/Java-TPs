package tp5_ejercicio9;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio9 {
    public static void main(String[] args) {
        CitaMedica citaMedica = new CitaMedica("17/9/2025", "10:00");
        Paciente paciente = new Paciente("Juan", "123436");
        Profesional profesional = new Profesional("Alberto", "Cardiologia");
        
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(profesional);
        
        System.out.println(citaMedica);
    }   
}
