package animals;

public class Hippo extends Animal {
    public Hippo(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Hgggggh");
    }
}
