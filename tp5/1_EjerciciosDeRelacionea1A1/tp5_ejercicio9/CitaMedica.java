package tp5_ejercicio9;

/**
 *
 * @author Fernando
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;//Asociacion unidireccional
    private Profesional profesional;//Asociacion unidireccional

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfesional(Profesional profesional) {
       this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + ", paciente=" + paciente + ", profesional=" + profesional + '}';
    }
    
}
