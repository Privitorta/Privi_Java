package Laboratorio.Simulazione_L17.L17E01;
public class Snack extends Product {
    private int calories;
    public Snack(String name, int price, int calories) {
        super(name, price);
        this.calories = calories;
    }
    public int getCalories() { return calories; }
}
