public class FixedBasedPartTime extends PartTime implements IPrintable {

    private int fixedAmount;
    private static int totalPayRoll;

    public FixedBasedPartTime(String name, int age, int rate, int hoursWorked, int fixedAmount) {
        super(name, age, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    public FixedBasedPartTime(String name, int age, Vehicle vehicle, int rate, int hoursWorked, int fixedAmount) {
        super(name, age, vehicle, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    public int getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(int fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public static int getTotalPayRoll(){
        return totalPayRoll;
    }

    @Override
    public int calcEarnings() { return getRate() * getHoursWorked() + fixedAmount; }

    @Override
    public void printMyData() {
        super.printMyData();
        int earning = calcEarnings();
        totalPayRoll += earning;
        System.out.println("-- Fixed Amt: " + fixedAmount +
                "\n--Earnings: " + earning);
    }
}
