package Laboratorio.L17E02;
public class Car extends Vehicle {

    private int numPax;

    public Car(String licensePlate, String model, int year, int numPax) {
        super(licensePlate, model, year);
        this.numPax = validateNumPax(numPax);
    }

    private int validateNumPax(int numPax) {
        if (numPax < 2 || numPax > 8) {
            numPax = 5;
        }
        return numPax;
    }

    public int getNumPax() {
        return this.numPax;
    }
    
}
