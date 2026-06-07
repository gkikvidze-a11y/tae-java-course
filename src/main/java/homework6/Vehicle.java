package homework6;

public class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void info() {
        System.out.println(brand + " " + year);
    }
}