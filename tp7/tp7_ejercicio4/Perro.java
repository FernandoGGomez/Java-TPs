package tp7_ejercicio4;

/**
 *
 * @author Fernando
 */
public class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }

    @Override
    public void describirAnimal() {
        System.out.println("Este animal es un perro");
    } 
    
}
