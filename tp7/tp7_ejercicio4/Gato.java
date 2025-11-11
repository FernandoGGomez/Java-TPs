package tp7_ejercicio4;

/**
 *
 * @author Fernando
 */
public class Gato extends Animal {
    
    @Override
    public void hacerSonido() {
        System.out.println("Miau!");
    }

    @Override
    public void describirAnimal() {
        System.out.println("Este animal es un gato");
    }
    
}
