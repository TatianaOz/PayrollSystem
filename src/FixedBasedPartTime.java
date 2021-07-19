public class FixedBasedPartTime extends PartTime implements IPrintable {

    /* Properties */
    private int fixedAmount;

    /* Getters and Setters */
    public int getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(int fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    /* Constructors */
    public FixedBasedPartTime(String name, int age, int rate, int hoursWorked, int fixedAmount) {
        super(name, age, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    public FixedBasedPartTime(String name, int age, Vehicle vehicle, int rate, int hoursWorked, int fixedAmount) {
        super(name, age, vehicle, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    // Calculate the earnings
    @Override
    public int calcEarnings() { return getRate() * getHoursWorked() + fixedAmount; }

    // Print all class properties and Earnings
    @Override
    public void printMyData() {
        super.printMyData();
        int earning = calcEarnings();
        System.out.println("-- Fixed Amt: " + fixedAmount +
                "\n-- Earnings: " + earning + " (" + (getRate() * getHoursWorked()) + " + " + fixedAmount + ")");
    }
}
