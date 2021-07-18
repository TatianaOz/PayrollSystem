public class Car extends Vehicle implements IPrintable{
    private int numDors;
    private boolean separateWheel;
    {
        numDors = 2;
    }
    public Car(String make, String plate) {
        super(make, plate);
    }

    public Car(String make, String plate, int numDors, boolean separateWheel) {
        super(make, plate);
        this.numDors = numDors;
        this.separateWheel = separateWheel;
    }

    @Override
    public void printMyData() {
        super.printMyData();
            System.out.println("-- Number of Dors: " + numDors
                    + "\n-- Separate Wheel: " + separateWheel
            );
    }

}
