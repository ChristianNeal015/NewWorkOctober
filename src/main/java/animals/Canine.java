package animals;

public class Canine extends Animal {

    public Canine(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Bark or howl");
    }
}
