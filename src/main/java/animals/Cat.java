package animals;

public class Cat extends Feline implements Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void greet() {
        System.out.println("Meow");
    }
}
