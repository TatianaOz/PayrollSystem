public abstract class Employee implements IPrintable {
    private String name;
    private int age;
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int calcBirthYear(){
        return 2021 - age;
    }

    public int calcEarnings(){
        return 1000;
    }

    public Employee(String name, int age, Vehicle vehicle){
        this.age = age;
        this.name = name;
        this.vehicle = vehicle;
    }

    @Override
    public void printMyData() {
        //todo add implementation
    }
}
