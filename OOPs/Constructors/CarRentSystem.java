class RentalSystem {
    private String model;
    private String color;
    private String year;
    private double mileage;
    private boolean rentalStatus;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(boolean rentalStatus) {
        this.rentalStatus = rentalStatus;
    }

    public RentalSystem() {
        this.color = "Polar White";
        this.model = "i20 sportz";
        this.year = "2019";
        this.mileage = 20.5;
        this.rentalStatus = false;
    }

    public RentalSystem(String model, String color, String year, double mileage, boolean rentalStatus) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.rentalStatus = rentalStatus;
    }

    public double calculateMileage(double distanceTraveled, double fuelConsumed) {
        if (fuelConsumed <= 0 || distanceTraveled <= 0) {
            return 0; 
        }

        return distanceTraveled / fuelConsumed;
    }
}

public class CarRentSystem {
    public static void main(String[] args) {
        RentalSystem car1 = new RentalSystem();
        double car1Mileage = car1.calculateMileage(300, 15); // Assuming car1 traveled 300 miles and consumed 15 gallons of fuel

        System.out.println("---------------------------");
        System.out.println("Car 1 Information: ");
        System.out.println("\nModel: " + car1.getModel());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Mileage: " + car1Mileage);
        System.out.println("Rental Status: " + car1.isRentalStatus());
        System.out.println("---------------------------");


        RentalSystem car2 = new RentalSystem("Mercedes", "Black", "2020", 19.0, false);
        double car2Mileage = car2.calculateMileage(250, 12); // Assuming car2 traveled 250 miles and consumed 12 gallons of fuel

        System.out.println("---------------------------");
        System.out.println("Car 2 Information: ");
        System.out.println("\nModel: " + car2.getModel());
        System.out.println("Color: " + car2.getColor());
        System.out.println("Year: " + car2.getYear());
        System.out.println("Mileage: " + car2Mileage);
        System.out.println("Rental Status: " + car2.isRentalStatus());
        System.out.println("---------------------------");
        
        RentalSystem car3 = new RentalSystem("Audi", "Red", "2021", 18.5, true);
        double car3Mileage = car3.calculateMileage(350, 20); // Assuming car3 traveled 350 miles and consumed 20 gallons of fuel

        System.out.println("---------------------------");
        System.out.println("Car 3 Information: ");
        System.out.println("\nModel: " + car3.getModel());
        System.out.println("Color: " + car3.getColor());
        System.out.println("Year: " + car3.getYear());
        System.out.println("Mileage: " + car3Mileage);
        System.out.println("Rental Status: " + car3.isRentalStatus());
        System.out.println("---------------------------");

    }
}
