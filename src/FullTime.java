public class FullTime extends Employee implements IPrintable {
    private int salary;
    private int bonus;
    private static int totalPayRoll;

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

    public static int getTotalPayRoll(){ return totalPayRoll; }

    @Override
    public int calcEarnings() { return salary + bonus; }

    @Override
    public void printMyData() {
        super.printMyData();
        int earning = calcEarnings();
        totalPayRoll += earning;
        System.out.println("Employee is Full Time" +
                "\n -- Salary: " + salary +
                "\n -- Bonus: " + bonus +
                "\n -- Earnings: " + earning);
    }
}
