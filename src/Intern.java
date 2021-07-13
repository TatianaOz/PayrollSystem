public class Intern extends Employee implements IPrintable {

    private String schoolName;

    public Intern(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void printMyData() {
        //todo add implementation
    }
}
