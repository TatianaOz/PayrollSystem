public class Motorcycle extends Vehicle implements IPrintable{
    /* Properties */
    private boolean sideCar;
    private boolean helmet;

    /* Getters and Setters */
    public boolean isHelmet() {
        return helmet;
    }

    public boolean isSideCar() {
        return sideCar;
    }

    public void setHelmet(boolean helmet) {
        this.helmet = helmet;
    }

    public void setSideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }

    /* Constructors */
    public Motorcycle(String make, String plate) {
        super(make, plate);
        sideCar = false;
        helmet = false;
    }

    public Motorcycle(String make, String plate, boolean sideCar, boolean helmet) {
        super(make, plate);
        this.sideCar = sideCar;
        this.helmet = helmet;
    }

    // Print all class properties
    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("-- Has sidecar: " + (sideCar ? "Yes" : "No")
                + "\n-- Has Helmet: " + (helmet ? "Yes" : "No")
        );
    }
}
