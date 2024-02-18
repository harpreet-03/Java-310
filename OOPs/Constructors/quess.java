class car {
    String color;
    String model;
    int year;
    String rentalStatus;

    public void set_rentalStatus() {

        this.rentalStatus = "Booked";
    }

    public String get_rentalStatus() {

        return this.rentalStatus;
    }

    public car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }
}

public class quess {
    public static void main(String[] args) {
        car farari = new car("red", "w3", 2024);
        farari.set_rentalStatus();
        farari.get_rentalStatus();
    }
}