package Laboratorio.L17E02;
public class Motorbike extends Vehicle {

    private int horsePower;

    public Motorbike(String licensePlate, String model, int year, int horsePower) {
        super(licensePlate, model, year);
        this.horsePower = validateHorsePower(horsePower);
    }

    private int validateHorsePower(int horsePower) {
        if (horsePower < 200 || horsePower > 2000) {
            horsePower = 1000;
        }
        return horsePower;
    }

    public int getHorsePower() {
        return this.horsePower;
    }
    
}
