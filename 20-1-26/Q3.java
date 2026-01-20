abstract class Vehicle {
    int vehicleNumber;
    String type;
    int rentalRate;

    Vehicle(int vn, String t, int rr) {
        vehicleNumber = vn;
        type = t;
        rentalRate = rr;
    }

    abstract void calculateRentalCost(int days);
    abstract void setInsurancePolicy();
    abstract void getInsuranceDetails();
    abstract void displayDetails();   
}


class Car extends Vehicle {
    private String insurancePolicy;
    int price;
    int rentalCost;

    Car(int vn, String t, int rr, int p) {
        super(vn, t, rr);
        price = p;
    }

    void calculateRentalCost(int days) {
        rentalCost = price * days;
    }

    void setInsurancePolicy() {
        insurancePolicy = "CAR_POLICY_001";
    }

    void getInsuranceDetails() {
        System.out.println("Car Insurance Policy: " + insurancePolicy);
    }

    void displayDetails() {
        System.out.println("Vehicle: " + type);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Rental Cost: $" + rentalCost);
    }
}

class Bike extends Vehicle {
    private String insurancePolicy;
    int price;
    int rentalCost;

    Bike(int vn, String t, int rr, int p) {
        super(vn, t, rr);
        price = p;
    }

    void calculateRentalCost(int days) {
        rentalCost = price * days;
    }

    void setInsurancePolicy() {
        insurancePolicy = "BIKE_POLICY_001";
    }

    void getInsuranceDetails() {
        System.out.println("Bike Insurance Policy: " + insurancePolicy);
    }

    void displayDetails() {
        System.out.println("Vehicle: " + type);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Rental Cost: $" + rentalCost);
    }
}

class Truck extends Vehicle {
    private String insurancePolicy;
    int price;
    int rentalCost;

    Truck(int vn, String t, int rr, int p) {
        super(vn, t, rr);
        price = p;
    }

    void calculateRentalCost(int days) {
        rentalCost = price * days;
    }

    void setInsurancePolicy() {
        insurancePolicy = "TRUCK_POLICY_001";
    }

    void getInsuranceDetails() {
        System.out.println("Truck Insurance Policy: " + insurancePolicy);
    }

    void displayDetails() {
        System.out.println("Vehicle: " + type);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Rental Cost: $" + rentalCost);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Vehicle car = new Car(101, "Car", 100, 50);
        Vehicle bike = new Bike(102, "Bike", 50, 20);
        Vehicle truck = new Truck(103, "Truck", 150, 100);

        Vehicle[] vehicles = {car, bike, truck};

        for (Vehicle v : vehicles) {
            v.calculateRentalCost(5); 
            v.setInsurancePolicy();
            v.displayDetails();
            v.getInsuranceDetails();
         
        }
    }
}
