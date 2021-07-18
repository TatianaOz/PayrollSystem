public class Intern extends Employee implements IPrintable {

    private String schoolName;
    private static int totalPayRoll;

    {
        totalPayRoll += calcEarnings();
    }

    public Intern(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public Intern(String name, int age, Vehicle vehicle, String schoolName) {
        super(name, age, vehicle);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public static int getTotalPayRoll(){ return totalPayRoll; }


    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Employee is Full Time" +
                "\n -- School Name : " + schoolName +
                "\n -- Earnings: " + calcEarnings());
    }
}
