import java.util.ArrayList;

public class Main {

    public static void main (String[] args){

        ArrayList<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new FixedBasedPartTime("Cindy", 25, new Car("Toyota", "AX280") ,30, 10, 40));
        allEmployees.add(new CommissionBasedPartTime("Matthew", 24, new Car("Acura", "BU12A") ,30, 40, 40));
        allEmployees.add(new Intern("John", 23, "Lambton College"));
        allEmployees.add(new Intern("Mark", 22, "Lambton College"));
        for(int i = 0; i < allEmployees.size(); i++) {
            allEmployees.get(i).printMyData();
            separador();
        }
        System.out.println("TOTAL PAYROLL " + (FixedBasedPartTime.getTotalPayRoll() + CommissionBasedPartTime.getTotalPayRoll() + Intern.getTotalPayRoll()));
    }

    private static void separador() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
