package Laboratorio.Simulazione_L17.L17E01;
public class Drink extends Product {
    private int volume;
    public Drink(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }
    public int getVolume() { return volume; }
}
