package tp5_ejercicio14;

/**
 *
 * @author Fernando
 */
public class Render {
    private String formato;
    private Proyecto proyecto;//Asociacion Unidireccional

    public Render(String formato) {
        this.formato = formato;
    }
    
    public String getFormato() {
        return formato;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
    
    public String nombreProyecto(){
        return proyecto.getNombre();
    }
    
}
