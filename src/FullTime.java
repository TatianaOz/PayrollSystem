public class FullTime extends Employee implements IPrintable {

    /* Properties */
    private int salary;
    private int bonus;

    /* Getters and Setters */
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /* Constructors */
    public FullTime(String name, int age, int bonus, int salary) {
        super(name, age);
        this.bonus = bonus;
        this.salary = salary;
    }

    public FullTime(String name, int age, Vehicle vehicle, int bonus, int salary) {
        super(name, age, vehicle);
        this.bonus = bonus;
        this.salary = salary;
    }

    // Calculate the Earnings
    @Override
    public int calcEarnings() { return salary + bonus; }

    // Print all class properties and Earnings
    @Override
    public void printMyData() {
        super.printMyData();
        int earning = calcEarnings();
        System.out.println("Employee is Full Time" +
                "\n -- Salary: " + salary +
                "\n -- Bonus: " + bonus +
                "\n -- Earnings: " + earning);
    }
}
