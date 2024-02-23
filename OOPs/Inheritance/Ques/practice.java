/*

Create a program to manage different types of vehicles in a transportation system. Each vehicle has a unique identification number and a maximum speed. Vehicles can be of different types such as cars, trucks, and bicycles.

Cars have an additional attribute: the number of passengers it can carry.
Trucks have an additional attribute: the maximum weight they can carry.
Bicycles do not have any additional attributes.
Implement the following functionalities:

Create a superclass named "Vehicle" with attributes:
identificationNumber (String)
maxSpeed (double)
Create subclasses named "Car", "Truck", and "Bicycle" inheriting from the "Vehicle" superclass.
For each subclass, implement a constructor that initializes the attributes along with appropriate getters and setters.
Implement a method in each subclass to display the details of the vehicle.
In the main class, create instances of each type of vehicle and demonstrate inheritance by calling methods from the superclass and subclasses.

*/


/*
--> super method calls the constructor of the superclass(Parent Class)


 In Java, super() is a method call that invokes the constructor of the superclass (the class from which the current class inherits) within the constructor of the subclass. It allows you to call a constructor of the superclass and initialize the inherited members of the subclass.
 
 */


class Vehicle {
    private String IdentificationNumber;
    private double maxSpeed;

    public Vehicle(String IdentificationNumber, double maxSpeed) {
        this.IdentificationNumber = IdentificationNumber;
        this.maxSpeed = maxSpeed;
    }

    public String getIdentificationNumber() {
        return IdentificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        IdentificationNumber = identificationNumber;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Identification Number: " + IdentificationNumber);
        System.out.println("Maximum Speed: " + maxSpeed + " km/h");
    }

}

class Car extends Vehicle {
    private int passengerCapacity;

    public Car(String identificationNumber, double maxSpeed, int passengerCapacity) {

        super(identificationNumber, maxSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

}

class Truck extends Vehicle {
    private double maxWeight;

    public Truck(String identificationNumber, double maxSpeed, double maxWeight) {

        super(identificationNumber, maxSpeed);
        this.maxWeight = maxWeight;
    }

    // Getter and setter for maxWeight
    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
}

class Bicycle extends Vehicle {

    public Bicycle(String identificationNumber, double maxSpeed) {
        super(identificationNumber, maxSpeed);
    }

}

public class practice {
    public static void main(String[] args) {
        Car car = new Car("CAR001", 180.0, 5);
        Truck truck = new Truck("TRUCK001", 100.0, 10.0);
        Bicycle bicycle = new Bicycle("BICYCLE001", 30.0);

        // Display details of each vehicle
        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println();

        System.out.println("Truck Details:");
        truck.displayDetails();
        System.out.println();

        System.out.println("Bicycle Details:");
        bicycle.displayDetails();
    }
}
