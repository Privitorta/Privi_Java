package Laboratorio.Simulazione_L17.L17E02;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rental {
    
    private List<Vehicle> vehicles;

    public Rental() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicle.getYear() != 2025) {
            throw new IllegalArgumentException("Only vehicles from year 2025 can be added.");
        }
        this.vehicles.add(vehicle);
    }

    public Car rentCar(int minPax, int year) {
        Iterator<Vehicle> iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            Vehicle vehicle = iterator.next();
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                if (car.getNumPax() >= minPax && car.getYear() >= year) {
                    iterator.remove();
                    car.incrementRentals();
                    return car;
                }
            }
        }
        return null;
    }

    public Motorbike rentMotorbike(String model, int minHorsePower) {
        Iterator<Vehicle> iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            Vehicle vehicle = iterator.next();
            if (vehicle instanceof Motorbike) {
                Motorbike motorbike = (Motorbike) vehicle;
                if (motorbike.getHorsePower() >= minHorsePower && motorbike.getModel().equals(model)) {
                    iterator.remove();
                    motorbike.incrementRentals();
                    return motorbike;
                }
            }
        }
        return null;
    }

    public void getBackVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void sort(){
        vehicles.sort(null);
    }


}
