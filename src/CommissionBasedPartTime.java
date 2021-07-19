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
    public CommissionBasedPartTime(String name, int age, int rate, int hoursWorked, int commission) {
        super(name, age, rate, hoursWorked);
        this.commission = commission;
    }

    public CommissionBasedPartTime(String name, int age,Vehicle vehicle, int rate, int hoursWorked, int commission) {
        super(name, age, vehicle, rate, hoursWorked);
        this.commission = commission;
    }

    // Calculate the earnings
    @Override
    public int calcEarnings() { return getRate() * getHoursWorked() + commission;}

    // Print all class properties and Earnings
    @Override
    public void printMyData() {
        super.printMyData();
        int earning = calcEarnings();
        System.out.println("-- Commission: " + commission + "%" +
                "\n-- Earnings: " + earning);
    }
}
