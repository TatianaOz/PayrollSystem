public class Intern extends Employee implements IPrintable {

    /* Properties */
    private String schoolName;

    /* Getters and Setters */
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /* Constructors */
    public Intern(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public Intern(String name, int age, Vehicle vehicle, String schoolName) {
        super(name, age, vehicle);
        this.schoolName = schoolName;
    }

    // Print all class properties and Earnings
    @Override
    public void printMyData() {
        super.printMyData();
        double earning = calcEarnings();
        System.out.println("Employee is " + this.getClass().getSimpleName() +
                "\n -- School Name : " + schoolName +
                "\n -- Earnings: " + String.format("%,.2f", earning));
    }
}
