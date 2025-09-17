package tp5_ejercicio14;

/**
 *
 * @author Fernando
 */
public class Tp5Ejercicio14 {
    public static void main(String[] args) {
            
        Proyecto proyecto = new Proyecto("Video1", 11);
        EditorVideo editor = new EditorVideo();
        
        editor.exportar("mp4", proyecto);
        
    }
}
