package animals;

public class Feline extends Animal {
    public Feline(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Meow or roar");
    }
}
