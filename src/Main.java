import java.util.ArrayList;

public class Main {

    // The main function code
    public static void main (String[] args){

        int totalPayRoll = 0;

        // Create arrayList for all employees
        ArrayList<Employee> allEmployees = new ArrayList<>();

        // Add employees to the list
        allEmployees.add(new FixedBasedPartTime("Cindy", 25, new Car("Toyota", "AX280", 4, true) ,30, 10, 40));
        allEmployees.add(new CommissionBasedPartTime("Matthew", 24, new Motorcycle("BMW", "BU12A", true, true) ,30, 40, 40));
        allEmployees.add(new Intern("John", 23,  new Motorcycle("Yamaha", "YA34A"), "Lambton College"));
        allEmployees.add(new Intern("Mark", 22, "Lambton College"));
        allEmployees.add(new FullTime("Chase", 22, new Car("kia", "AU250") ,20, 20));

        // Print data of each employee and calculate the total earnings for all employees in the list
        for(int i = 0; i < allEmployees.size(); i++) {
            allEmployees.get(i).printMyData();
            totalPayRoll = totalPayRoll + allEmployees.get(i).calcEarnings();
            separator();
        }
        System.out.println("TOTAL PAYROLL: " + totalPayRoll + " Canadian Dollars");
    }

    // print the separator between employees
    private static void separator() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }

}
