package tp2.ejercicio13;

/**
 *
 * @author Fernando
 */

/*
Arrays y Recursividad:
13. Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.
Salida esperada:
Precios originales:
Precio: $199.99
Precio: $299.5
Precio: $149.75
Precio: $399.0
Precio: $89.99
Precios modificados:
Precio: $199.99
Precio: $299.5
Precio: $129.99
Precio: $399.0
Precio: $89.99
Conceptos Clave Aplicados:
✔ Uso de arrays (double[]) para almacenar valores.
✔ Recorrido del array con una función recursiva en lugar de un bucle.
✔ Modificación de un valor en un array mediante un índice.
✔ Uso de un índice como parámetro en la recursión para recorrer el
array.
*/
public class TP2Ejercicio13 {
    static int cont = 0;
    public static void main(String[] args) {
        double[] precios = {10.50, 23.30, 12.70,8,6.50};
        
        System.out.println("Precios orginales:");
        mostrarPrecios(precios);
        
        precios[2] = 1500;
        
        System.out.println("Precios modificados:");
        mostrarPrecios(precios);
    }
    
    static void mostrarPrecios(double[] precios){
        
        if(precios.length == (cont)){
            cont = 0;
        }else{
            System.out.println(precios[cont]);
            cont++;
            mostrarPrecios(precios);
        }
    }
    
}
