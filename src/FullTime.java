public class FullTime extends Employee implements IPrintable {

    /* Properties */
    private double salary;
    private double bonus;

    /* Getters and Setters */
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /* Constructors */
    public FullTime(String name, int age, double bonus, double salary) {
        super(name, age);
        this.bonus = bonus;
        this.salary = salary;
    }

    public FullTime(String name, int age, Vehicle vehicle, double bonus, double salary) {
        super(name, age, vehicle);
        this.bonus = bonus;
        this.salary = salary;
    }

    // Calculate the Earnings
    @Override
    public double calcEarnings() { return salary + bonus; }

    // Print all class properties and Earnings
    @Override
    public void printMyData() {
        super.printMyData();
        double earning = calcEarnings();
        System.out.println("Employee is Full Time" +
                "\n -- Salary: " + String.format("%,.2f", salary) +
                "\n -- Bonus: " + String.format("%,.2f", bonus) +
                "\n -- Earnings: " + String.format("%,.2f", earning) + " (" + String.format("%,.2f", salary) + " + " + String.format("%,.2f", bonus) + ")");
    }
}
