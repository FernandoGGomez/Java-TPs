package tp6_ejercicio1_stock_tienda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Fernando
 */
public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();
    
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }  
    public void listarProductos(){
        
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
        
    }  
    
    public Producto buscarProductoPorId(String id){
        Producto productoEncontrado = null;
        int i = 0;
        while( i < productos.size() && !this.productos.get(i).getId().equalsIgnoreCase(id)){
            i++;
        }
        
        if(i < productos.size()){
            productoEncontrado = this.productos.get(i);
        }        
        
        return productoEncontrado;
    }  
    
  
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> prodPorCategoria = new ArrayList<>(); 
        for (Producto producto : productos) {
            if(producto.getCategoria()== categoria ){
                prodPorCategoria.add(producto);
            } 
        }
        
        
        return prodPorCategoria;
        
    }  
    
    public void eliminarProductoPorId(String id){
       Producto productoAEliminar = this.buscarProductoPorId(id);
       this.productos.remove(productoAEliminar);
    }  
    
    
    public void actualizarStock(String id, int nuevaCantidad){
        Producto productoParaActualizar = this.buscarProductoPorId(id);
        productoParaActualizar.actualizarStock(nuevaCantidad);
    }  
    
    
    
    public int totalStock(){
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock += producto.getCantidad();      
        }
        return totalStock;
    }  
    
    
    public Producto productoConMayorStock(){
        Producto prodMayorStock = null;
        int mayorStock = 0;
        for (Producto producto : productos) {
            if(producto.getCantidad() > mayorStock){
                mayorStock = producto.getCantidad();
                prodMayorStock = producto;
            }
        }
        
        
        return prodMayorStock;
    }  
    
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : productos) {
            if(producto.getPrecio() > min && producto.getPrecio() < max){
                productosFiltrados.add(producto);
            }
        }
        
        
        return productosFiltrados;
    }  
    
    
    
    public void mostrarCategoriasDisponibles(){
        ArrayList<CategoriaProducto> catDisponibles = new ArrayList<>(); 
        int i = 0;
        while(i < productos.size()){
            if(!catDisponibles.contains(productos.get(i).getCategoria())){ /*Si la lista no contiene la categoría la agrego, si no no*/
                catDisponibles.add(productos.get(i).getCategoria());        /*Esto es para que no se repitan las categorías*/
                System.out.print(productos.get(i).getCategoria() + ": ");
                System.out.println(productos.get(i).getCategoria().getDescripcion());
            }
            i++;
        } 
    }

    
}
