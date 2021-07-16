public class Car extends Vehicle implements IPrintable{

    public Car(String make, String plate) {
        super(make, plate);
    }

    @Override
    public void printMyData() {
        this.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
