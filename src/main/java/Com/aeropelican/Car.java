package Com.aeropelican;

public class Car extends Vehicle {
    @Override
    void calculateToll() {
        System.out.println("Car Toll Calculated: Rs.100");
    }
    @Override
    public void payToll() {
        System.out.println("Rs.100 paid via FastTag for Car.\n");
    }
}
