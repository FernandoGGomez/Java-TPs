package tp5_ejercicio14;

/**
 *
 * @author Fernando
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato);//dependencia de creacion
        render.setProyecto(proyecto);
        
        System.out.println("El proyecto " + render.nombreProyecto() + " se renderizo en formato " + render.getFormato());
    }
}
