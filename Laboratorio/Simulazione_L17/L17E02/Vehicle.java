package Laboratorio.Simulazione_L17.L17E02;

public class Vehicle implements Comparable<Vehicle> {

    // Attributes
    protected String licensePlate;             
    protected String model;
    protected int year;
    protected int numRentals;   

    // Constructor
    public Vehicle(
                   String licensePlate,
                   String model,
                   int year) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.year = validateYear(year);
        this.numRentals = 0;
    }


    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    protected int validateYear(int year) {
        if (year < 1800 || year > 2025) {
            year = 2025;
        }
        return year;
    }

    @Override
    public String toString() {
        return String.format("Vehicle(plate=%s, model=%s, year=%d)", this.licensePlate, this.model, this.year);
    }

    public int getNumRentals() {
        return this.numRentals;
    }

    public void incrementRentals() {
        this.numRentals++;
    }


    @Override
    public int compareTo(Vehicle o) {
        return Integer.compare(this.year, o.year);
    }

}
