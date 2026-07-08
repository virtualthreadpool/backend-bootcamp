package Com.aeropelican;
public class Main {
    public static void main(String[] args) {

//        // Demonstrating Polymorphism: Using a Vehicle reference to point to a Car object
//        Vehicle myCar = new Car();
//        myCar.setVehicleNumber("AP75BB4547"); // Encapsulation
//        myCar.startVehicle();
//        myCar.calculateToll();                // Polymorphic call
//        myCar.payToll();

//        // Testing with a Truck object
//        Vehicle myTruck = new Truck();
//        myTruck.setVehicleNumber("MP09HH6439");
//        myTruck.startVehicle();
//        myTruck.calculateToll();
//        myTruck.payToll();

        Vehicle myBus = new Bus();
        myBus.setVehicleNumber("TN45CF5252");
        myBus.startVehicle();
        myBus.calculateToll();
        myBus.payToll();
    }
}