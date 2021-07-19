import java.util.ArrayList;

public class Main {

    // The main function code
    public static void main (String[] args){

        double totalPayRoll = 0;

        // Create arrayList for all employees
        ArrayList<Employee> allEmployees = new ArrayList<>();

        // Add employees to the list
        allEmployees.add(new FixedBasedPartTime("Cindy", 25, new Car("Toyota", "AX280", 4, true) ,30.2, 10, 40));
        allEmployees.add(new CommissionBasedPartTime("Matthew", 24, new Motorcycle("BMW", "BU12A", true, true) ,30, 40, 40));
        allEmployees.add(new Intern("John", 23,  new Motorcycle("Yamaha", "YA34A"), "Lambton College"));
        allEmployees.add(new Intern("Mark", 22, "Lambton College"));
        allEmployees.add(new FullTime("Chase", 22, new Car("Kia", "AU250") ,20, 20));
        allEmployees.add(new FullTime("James", 31,50, 2300));
        allEmployees.add(new FixedBasedPartTime("Jane", 33,37, 15, 57.95));
        allEmployees.add(new CommissionBasedPartTime("Sam", 42 ,29.5, 38, 25));


        // Print data of each employee and calculate the total earnings for all employees in the list
        for (Employee allEmployee : allEmployees) {
            allEmployee.printMyData();
            totalPayRoll = totalPayRoll + allEmployee.calcEarnings();
            separator();
        }
        System.out.println("TOTAL PAYROLL: " + String.format("%,.2f", totalPayRoll) + " Canadian Dollars");
    }

    // print the separator between employees
    private static void separator() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }

}
