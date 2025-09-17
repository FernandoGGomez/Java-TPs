package tp5_ejercicio2;

/**
 *
 * @author Fernando
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;//Asociacion bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if(celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }
    
    
    public Celular getCelular(){
        return this.celular;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular.getMarca()+ " " + celular.getModelo() + '}';
    }
    
    
    
}
