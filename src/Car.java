public class Car extends Vehicle implements IPrintable{
    private int numDoors;
    private boolean separateWheel;

    public Car(String make, String plate) {
        super(make, plate);
        this.numDoors = 2;
        this.separateWheel = true;
    }

    public Car(String make, String plate, int numDoors, boolean separateWheel) {
        super(make, plate);
        this.numDoors = numDoors;
        this.separateWheel = separateWheel;
    }

    @Override
    public void printMyData() {
        super.printMyData();
            System.out.println("-- Number of Doors: " + numDoors
                    + "\n-- Separate Wheel: " + (separateWheel ? "Yes" : "No")
            );
    }

}
