public class Motorcycle extends Vehicle implements IPrintable{
    private boolean sideCar;
    private boolean helmet;

    public Motorcycle(String make, String plate) { super(make, plate); }

    public Motorcycle(String make, String plate, boolean sideCar, boolean helmet) {
        super(make, plate);
        this.sideCar = sideCar;
        this.helmet = helmet;
    }
    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("-- Has sidecar: " + (sideCar ? "Yes" : "No")
                + "\n-- Has Helmet: " + (helmet ? "Yes" : "No")
        );
    }
}
