package Animal;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Animal cat = new Animal("Darvey");
        Animal dog = new Animal("Bingo");

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(cat);
        animals.add(dog);

        for(Animal animal: animals) {
            System.out.println(animal);
        }
        animals.clear();
//        groceryList.add(new Animal("Meldor"));

        System.out.println(animals);
    }
}
