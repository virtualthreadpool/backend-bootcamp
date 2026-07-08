package Com.aeropelican;

public class Truck extends Vehicle {
    @Override
    void calculateToll() {
        System.out.println("Truck Toll Calculated: Rs.400");
    }
    @Override
    public void payToll() {
        System.out.println("Rs.400 paid via Card for Truck.\n");
    }
}

