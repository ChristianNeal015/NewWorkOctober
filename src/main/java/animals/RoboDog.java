package animals;

public class RoboDog extends Robot implements Pet {
    private String name;

    public RoboDog(String name){
       this.name = name;
    }


    @Override
    public void greet() {
        System.out.println("Holographic Barks");
    }
}
