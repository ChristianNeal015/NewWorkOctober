package cat;

public class Cat {
    private String name;
    private int birthdate;

    public Cat(String name, int birthdate){
        this.name = name;
        this.birthdate = birthdate;

    }
    public String speak(String s){
        return speak("Meow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }
}
