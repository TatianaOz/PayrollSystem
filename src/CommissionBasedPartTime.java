public class CommissionBasedPartTime extends PartTime implements IPrintable {

    private int commission;
    private static int totalPayRoll;

    public CommissionBasedPartTime(String name, int age, int rate, int hoursWorked, int commission) {
        super(name, age, rate, hoursWorked);
        this.commission = commission;
    }

    public CommissionBasedPartTime(String name, int age,Vehicle vehicle, int rate, int hoursWorked, int commission) {
        super(name, age, vehicle, rate, hoursWorked);
        this.commission = commission;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public static int getTotalPayRoll(){
        return totalPayRoll;
    }

    @Override
    public int calcEarnings() {
        int earning = getRate() * getHoursWorked() + commission;
        totalPayRoll += earning;
        return earning;
    }

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("-- Commission: " + commission + "%" +
                "\n--Earnings: " + calcEarnings());
    }
}
