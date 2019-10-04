package animals;

public class animalsTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Charles");
        Cat cat = new Cat("Guy");
        RoboDog roboDog = new RoboDog("Marty Mechanic 151");

        Pet[] Pets = {dog, cat, roboDog};
        Pets(Pets);

    }


    public static void Pets(Pet[] x){
        for (int d = 0; d < x.length; d++) {

         x[d].greet();
        }
    }
}

