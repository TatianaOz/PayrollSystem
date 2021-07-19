public class Car extends Vehicle implements IPrintable{
    /* Properties */
    private int numDoors;
    private boolean separateWheel;

    /* Getters and Setters */
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isSeparateWheel() {
        return separateWheel;
    }

    public void setSeparateWheel(boolean separateWheel) {
        this.separateWheel = separateWheel;
    }

    /* Constructors */
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

    // Print all class properties
    @Override
    public void printMyData() {
        super.printMyData();
            System.out.println("-- Number of Doors: " + numDoors
                    + "\n-- Separate Wheel: " + (separateWheel ? "Yes" : "No")
            );
    }

}
