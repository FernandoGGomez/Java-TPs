package tp6_ejercicio1_stock_tienda;

/**
 *
 * @author Fernando
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    
    
    public void mostrarInfo(){
        System.out.println("Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + "}");
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }
    

    public int getCantidad() {
        return cantidad;
    }
    
    public void actualizarStock(int nuevaCantidad){
        this.cantidad = nuevaCantidad;
    }
    
    public CategoriaProducto getCategoria() {
        return categoria;
    }

    

                
}
