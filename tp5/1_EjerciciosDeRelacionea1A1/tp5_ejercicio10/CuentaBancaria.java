package tp5_ejercicio10;

/**
 *
 * @author Fernando
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private Titular titular;//asociacion bidireccional
    private ClaveSeguridad claveSeguridad;//Relacion de Composicion

    public CuentaBancaria(String cbu,String codigo) {
        this.cbu = cbu;
        this.saldo = 0;
        this.claveSeguridad = new ClaveSeguridad(codigo);
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getCuentaBancaria() != this){
            titular.setCuentaBancaria(this);
        }
    }

    public String getCbu() {
        return cbu;
    }

    
    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", titular=" + titular.getDni() + ", claveSeguridad=" + claveSeguridad + '}';
    }
    
}
