package reuploadHw;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String employeeId, double weeklySalary) {
        super(firstName, lastName, employeeId);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double paycheck() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }
}
