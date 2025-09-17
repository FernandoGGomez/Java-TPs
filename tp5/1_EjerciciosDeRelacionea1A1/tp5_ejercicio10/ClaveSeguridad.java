package tp5_ejercicio10;

import java.time.LocalDate;

/**
 *
 * @author Fernando
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo) {
        this.codigo = codigo;
        this.setUltimaModificacion();
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion() {
        this.ultimaModificacion = LocalDate.now().toString();
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }
    
}
