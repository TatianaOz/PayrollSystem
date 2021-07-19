public class CommissionBasedPartTime extends PartTime implements IPrintable {

    /* Properties */
    private int commission;

    /* Getters and Setters */
    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    /* Constructors */
    public CommissionBasedPartTime(String name, int age, double rate, int hoursWorked, int commission) {
        super(name, age, rate, hoursWorked);
        this.commission = commission;
    }

    public CommissionBasedPartTime(String name, int age,Vehicle vehicle, double rate, int hoursWorked, int commission) {
        super(name, age, vehicle, rate, hoursWorked);
        this.commission = commission;
    }

    // Calculate the earnings
    @Override
    public double calcEarnings() {
        double base = getRate() * getHoursWorked();
        return base + (base * commission / 100);
    }

    // Print all class properties and Earnings
    @Override
    public void printMyData() {
        super.printMyData();
        double earning = calcEarnings();
        double base = getRate() * getHoursWorked();
        System.out.println("-- Commission: " + commission + "%" +
                "\n-- Earnings: " + String.format("%,.2f", earning) + " (" + String.format("%,.2f", base) + " + " + commission + "% of " + String.format("%,.2f", base) + ")");
    }
}
