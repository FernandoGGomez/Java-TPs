package tp5_ejercicio10;

/**
 *
 * @author Fernando
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;//Asociacion Bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if(cuentaBancaria != null && cuentaBancaria.getTitular() != this){
            cuentaBancaria.setTitular(this);
        }
    }

    public String getDni() {
        return dni;
    }
    
    

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", cuentaBancaria=" + cuentaBancaria.getCbu() + '}';
    }
    
}
