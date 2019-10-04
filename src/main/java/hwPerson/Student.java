package hwPerson;

public abstract class Student extends Person implements Learner {
    private double totalStudyTime;


    public Student(String name, long id, double totalStudyTime) {
        super(name, id);
        this.totalStudyTime += totalStudyTime;
    }
    @Override
    public double getTotalStudyTime()
    {
        return totalStudyTime;
    }
}
