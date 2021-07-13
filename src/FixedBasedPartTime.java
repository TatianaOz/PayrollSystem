public class FixedBasedPartTime extends PartTime implements IPrintable {

    private int fixedAmount;

    public FixedBasedPartTime(String name, int age, int rate, int hoursWorked, int fixedAmount) {
        super(name, age, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    public int getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(int fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public int calcEarnings() {
        return getRate() *getHoursWorked() + fixedAmount;
    }

    @Override
    public void printMyData() {
        //todo add implementation
    }
}
