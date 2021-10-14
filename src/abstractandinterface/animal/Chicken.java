package abstractandinterface.animal;
import abstractandinterface.edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    public String howToEat() {
        return "could be fried";
    }
}
