package HybridInheritance;

interface Refuelable {
    void refuel();
}

class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayVehicle() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println("Filling Tanker.");
    }
}

public class Q2 {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 220);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        System.out.println("Electric Vehicle:");
        ev.displayVehicle();
        ev.charge();
        System.out.println("Petrol Vehicle:");
        pv.displayVehicle();
        pv.refuel();
    }
}
