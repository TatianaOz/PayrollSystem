public abstract class Vehicle implements IPrintable{

    /* Properties */
    private String make;
    private String plate;

    /* Constructor */
    public Vehicle(String make, String plate){
        this.make = make;
        this.plate = plate;
    }

    /* Getters and Setters */
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    // Print all class properties
    @Override
    public void printMyData() {
       System.out.println("-- Make: " + make + "\n-- Plate: " + plate);
    }

}
