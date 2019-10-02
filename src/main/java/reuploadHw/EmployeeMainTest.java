package reuploadHw;

public class EmployeeMainTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Christian", "Neal", "Badge");
        SalariedEmployee salariedEmployee = new SalariedEmployee("May", "June", "badge2", 2000.0);
        CommissionedEmployee commissionedEmployee = new CommissionedEmployee("Jayo", "Douglas", "badge3", 50000.0, 50000.0);
        System.out.println(commissionedEmployee.paycheck());
        BasePlusEmployee basePlusEmployee = new BasePlusEmployee("Haley", "Williams", "badge4", 300.0, 40.0, 900000.0);

        Employee[] Employee = {salariedEmployee, basePlusEmployee, commissionedEmployee};
            for(Employee x :Employee){
                System.out.println(x);
            }
        }
    }

