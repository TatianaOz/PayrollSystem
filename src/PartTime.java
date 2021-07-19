public abstract class PartTime extends Employee implements IPrintable {

    /* Properties */
    private int rate;
    private int hoursWorked;

    /* Getters and Setters */
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /* Constructors */
    public PartTime(String name, int age, int rate, int hoursWorked) {
        super(name, age);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public PartTime(String name, int age, Vehicle vehicle, int rate, int hoursWorked) {
        super(name, age, vehicle);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    // Print all class properties
    @Override
    public void printMyData() {
        super.printMyData();
        if (this instanceof FixedBasedPartTime)
            System.out.println("Employee is Part Time / Fixed Amt" );
        else
            System.out.println("Employee is Part Time / Commissioned" );
            System.out.println("-- Rate: " + rate +
                     "\n-- Hours Worked: " + hoursWorked);
    }

}
