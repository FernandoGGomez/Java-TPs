package tp6_ejercicio1_stock_tienda;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class StockTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.  
        
        //Instanciacion de inventario
        Inventario inventario = new Inventario();
        
        //Instanciacion de productos
        Producto p1 = new Producto("ABC-1","Producto1",1500.50,300,CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("DAC-1","Producto2",2700.50,100,CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("ABC-2","Producto3",4500.50,200,CategoriaProducto.ALIMENTOS);
        Producto p4 = new Producto("DEF-1","Producto4",5500.50,600,CategoriaProducto.ROPA);    
        Producto p5 = new Producto("EDC-1","Producto5",3500.50,800,CategoriaProducto.HOGAR);

        //Agregacion de productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        
        //2.Listar todos los productos mostrando su información y categoría
        System.out.println("Lista de productos:");
        inventario.listarProductos();
        
        //3.Buscar un producto por ID y mostrar su información.
        System.out.println("Buscar Producto por ID:");
        Producto productoEncontrado = inventario.buscarProductoPorId("ABC-1"); 
        if(productoEncontrado != null){
            productoEncontrado.mostrarInfo();
        }else{
            System.out.println("No existe un producto con ese ID");
        }
        
        System.out.println("---------------------------------------------------------------------------");
        
        //4.Filtrar y mostrar productos que pertenezcan a una categoría específica.  
        System.out.println("Filtrar y mostrar productos por categoria:");
        final CategoriaProducto cat = CategoriaProducto.ALIMENTOS; //cambiar de categoría aca para probar
        ArrayList<Producto> prodPorCategoria = inventario.filtrarPorCategoria(cat); 
        if(!prodPorCategoria.isEmpty()){
            System.out.println("Productos de categoria: " + cat);
            mostrarLista(prodPorCategoria);
        }else{
            System.out.println("No existe un producto con esa categoria");
        
        }
              
        System.out.println("---------------------------------------------------------------------------");

        //5.Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("Eliminar Producto por ID:");
        System.out.println("Lista de productos antes de eliminar un producto:");
        inventario.listarProductos();
        System.out.println("Lista de productos despues de eliminar un producto:");
        inventario.eliminarProductoPorId("ABC-1"); 
        inventario.listarProductos();
        
        System.out.println("---------------------------------------------------------------------------");

        //6.Actualizar el stock de un producto existente.  
        Producto pStock = inventario.buscarProductoPorId("DAC-1");
        System.out.println("Producto antes de actualizar Stock:");
        pStock.mostrarInfo();
        inventario.actualizarStock("DAC-1", 1500);
        System.out.println("Producto despues de actualizar Stock:");
        pStock.mostrarInfo();
        
        System.out.println("---------------------------------------------------------------------------");

        //7.Mostrar el total de stock disponible.
        System.out.println("Stock total: " + inventario.totalStock());
        
        System.out.println("---------------------------------------------------------------------------");
        
        //8.Obtener y mostrar el producto con mayor stock.
        Producto prodMayorStock = inventario.productoConMayorStock();
        System.out.println("Producto con mayor stock:");
        prodMayorStock.mostrarInfo();
        
        System.out.println("---------------------------------------------------------------------------");
        
        //9.Filtrar productos con precios entre $1000 y $3000.  
        double precioMin = 1000;
        double precioMax = 3000;
        ArrayList<Producto> prodFiltradosPorPrecio = inventario.filtrarProductosPorPrecio(precioMin,precioMax);
        System.out.println("Productos con precios entre $1000 y $3000:");
        if(!prodFiltradosPorPrecio.isEmpty()){
            mostrarLista(prodFiltradosPorPrecio);
        }else{
            System.out.println("No hay productos entre $"+precioMin+" y $"+precioMax);
        }
        
        System.out.println("---------------------------------------------------------------------------");
        
        //10.Mostrar las categorías disponibles con sus descripciones
        System.out.println("Mostrar categorias disponibles: ");
        inventario.mostrarCategoriasDisponibles();
      
      
        
    }
  
   public static void mostrarLista(ArrayList<Producto> lista){
       for (Producto producto : lista) {
           producto.mostrarInfo();
       }
}  

    
}
