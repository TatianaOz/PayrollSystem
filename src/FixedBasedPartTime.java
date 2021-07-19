public class FixedBasedPartTime extends PartTime implements IPrintable {

    /* Properties */
    private double fixedAmount;

    /* Getters and Setters */
    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    /* Constructors */
    public FixedBasedPartTime(String name, int age, double rate, int hoursWorked, double fixedAmount) {
        super(name, age, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    public FixedBasedPartTime(String name, int age, Vehicle vehicle, double rate, int hoursWorked, double fixedAmount) {
        super(name, age, vehicle, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    // Calculate the earnings
    @Override
    public double calcEarnings() { return getRate() * getHoursWorked() + fixedAmount; }

    // Print all class properties and Earnings
    @Override
    public void printMyData() {
        super.printMyData();
        double earning = calcEarnings();
        System.out.println("-- Fixed Amt: " + String.format("%,.2f", fixedAmount) +
                "\n-- Earnings: " + String.format("%,.2f", earning) + " (" + String.format("%,.2f", getRate() * getHoursWorked()) + " + " + String.format("%,.2f", fixedAmount) + ")");
    }
}
