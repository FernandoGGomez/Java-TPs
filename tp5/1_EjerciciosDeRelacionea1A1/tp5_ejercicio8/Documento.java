package tp5_ejercicio8;

/**
 *
 * @author Fernando
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;//Relacion de Composicion

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }
    
    
}
