import java.util.ArrayList;

public class Main {

    public static void main (String[] args){

        ArrayList<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new FixedBasedPartTime("Cindy", 25, new Car("Toyota", "Corolla") ,30, 10, 40));
    allEmployees.get(0).printMyData();
    }
}
