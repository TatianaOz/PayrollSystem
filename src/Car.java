public class Car extends Vehicle implements IPrintable{

    public Car(String make, String plate) {
        super(make, plate);
    }

    @Override
    public void printMyData() {
        super.printMyData();
        //todo add additional attributes and print it
    }

}
