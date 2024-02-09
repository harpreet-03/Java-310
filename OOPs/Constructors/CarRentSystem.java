
class RentalSystem {
    private String model;
    private String color;
    private String year;
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
        this.rentalStatus = false;
    }

    public RentalSystem(String model, String color, String year, boolean rentalStatus) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.rentalStatus = rentalStatus;
    }

}

public class CarRentSystem {
    public static void main(String[] args) {
        RentalSystem car1 = new RentalSystem();

        System.out.println("---------------------------");
        System.out.println("Car 1 Information: ");
        System.out.println("\nModel: " + car1.getModel());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Rental Status: " + car1.isRentalStatus());
        System.out.println("---------------------------");


        System.out.println("---------------------------");
        System.out.println("Car 2 Information: ");

        RentalSystem car2 = new RentalSystem("Mercedes", "Black", "2020", false);
        System.out.println("\nModel: " + car2.getModel());
        System.out.println("Color: " + car2.getColor());
        System.out.println("Year: " + car2.getYear());
        System.out.println("Rental Status: " + car2.isRentalStatus());
        System.out.println("---------------------------");

        System.out.println("---------------------------");
        System.out.println("Car 3 Information: ");
        RentalSystem car3 = new RentalSystem("Audi", "Red", "2021", true);
        System.out.println("\nModel: " + car3.getModel());
        System.out.println("Color: " + car3.getColor());
        System.out.println("Year: " + car3.getYear());
        System.out.println("Rental Status: " + car3.isRentalStatus());
        System.out.println("---------------------------");

    }
}
