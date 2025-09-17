package tp5_ejercicio13;

/**
 *
 * @author Fernando
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
        CodigoQR codigoQr = new CodigoQR(valor);//Dependencia de Creacion
        codigoQr.setUsuario(usuario);
        
        System.out.println("Se genero el "+ codigoQr);
    }
}
