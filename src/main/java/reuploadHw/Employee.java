package reuploadHw;

public class Employee {
    private String firstName;
    private String lastName;
    private String employeeId;

    public Employee(String firstName, String lastName, String employeeId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
    }
    public double paycheck(){

        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
