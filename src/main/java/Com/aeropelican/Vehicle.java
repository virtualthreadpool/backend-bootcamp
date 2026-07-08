package Com.aeropelican;

public abstract class Vehicle implements Payment {
    // Encapsulation
    private String vehicleNumber;
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public void startVehicle() {
        System.out.println("Vehicle with number " + getVehicleNumber() + " started moving.");
    }
    // Abstract method to be implemented by specific vehicles
    abstract void calculateToll();
}
