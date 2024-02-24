
public class RentCar {

    public static void main(String[] args) {
        // RangeRover object
        Car rangeRover = new Car();

        // Add specifications
        rangeRover.setID(1);
        rangeRover.setMake("Land Rover");
        rangeRover.setModel("Range Rover");
        rangeRover.setYear(2023);
        rangeRover.setType("SUV");
        rangeRover.setFuelType("Petrol");
        rangeRover.setTransmissionType("Automatic");
        rangeRover.setMileage(12.5);
        rangeRover.setDailyRate(15000.0);
        rangeRover.setAvailabilityStatus(false); // Mark as rented
        rangeRover.setLocation("BranchA");

        // Print information in a formatted box
        System.out.println();
        printCarInfo(rangeRover);


        // Audi object
        Car audi = new Car();

        audi.setID(2);
        audi.setMake("Audi");
        audi.setModel("R8");
        audi.setYear(2022);
        audi.setType("Sports car");
        audi.setFuelType("Petrol");
        audi.setTransmissionType("Manual");
        audi.setMileage(13.5);
        audi.setDailyRate(80520);
        audi.setAvailabilityStatus(true);
        audi.setLocation("Chandigarh");

        System.out.println();
        printCarInfo(audi);

    }


    //Function for Displaying The Info:
    public static void printCarInfo(Car car) {
        String[] lines = {
                "+------------------------------------------------+",
                "|               Car Information                  |",
                "+------------------------------------------------+",
                "| ID: " + padLeft(Integer.toString(car.getID()), 42) + " |",
                "| Make: " + padLeft(car.getMake(), 39) + "  |",
                "| Model: " + padLeft(car.getModel(), 38) + "  |",
                "| Year: " + padLeft(Integer.toString(car.getYear()), 39) + "  |",
                "| Type: " + padLeft(car.getType(), 39) + "  |",
                "| Fuel Type: " + padLeft(car.getFuelType(), 34) + "  |",
                "| Transmission Type: " + padLeft(car.getTransmissionType(), 26) + "  |",
                "| Mileage: " + padLeft(Double.toString(car.getMileage()), 36) + "  | ",
                "| Daily Rate: " + padLeft(Double.toString(car.getDailyRate()), 34) + " |",
                "| Availability Status: " + padLeft(Boolean.toString(car.isAvailabilityStatus()), 23) + "   |",
                "| Location: " + padLeft(car.getLocation(), 36) + " |",
                "+------------------------------------------------+"
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static String padLeft(String str, int length) {
        return String.format("%1$" + length + "s", str);
    }

}

class Car {
    // Private attributes
    private int ID;
    private String make;
    private String model;
    private int year;
    private String type;
    private String fuelType;
    private String transmissionType;
    private double mileage;
    private double dailyRate;
    private boolean availabilityStatus;
    private String location;

    // Constructors
    public Car() {
        // Default constructor
    }

    public Car(int ID, String make, String model, int year, String type, String fuelType, String transmissionType,
            double mileage, double dailyRate, boolean availabilityStatus, String location) {
        this.ID = ID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.type = type;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.mileage = mileage;
        this.dailyRate = dailyRate;
        this.availabilityStatus = availabilityStatus;
        this.location = location;
    }

    // Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Public methods
    public double calculateRentalCost(int rentalDays) {
        if (rentalDays <= 0) {
            return 0.0;
        }
        return rentalDays * dailyRate;
    }

    public void markRented(String branchID) {
        availabilityStatus = false;
        location = branchID;
    }

    public void markReturned(String branchID) {
        availabilityStatus = true;
        location = branchID;
    }
}
