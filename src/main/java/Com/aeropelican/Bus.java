package Com.aeropelican;

public class Bus extends Vehicle {

    @Override
    void calculateToll() {
        System.out.println("Bus Toll Calculated: Rs.250");
    }
    @Override
    public void payToll() {
        System.out.println("Rs.250 paid via Cash for Bus.\n");
    }
}
