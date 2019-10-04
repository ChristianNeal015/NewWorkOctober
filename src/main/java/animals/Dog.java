package animals;

public class Dog extends Canine implements Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Bark");
    }

    @Override
    public void greet() {
        System.out.println("Bark");
    }
}
