package Laboratorio.Simulazione_L17.L17E01;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public Snack buySnack(int money, int calories) {
        Iterator<Product> it = this.products.iterator();
        while (it.hasNext()) {
            Product p = it.next();
            if (p instanceof Snack) {
                Snack m = (Snack) p;
                if (m.getPrice() <= money && m.getCalories() <= calories) {
                    it.remove();
                    return m;
                }
            }
        }
        return null;
    }

    public Drink buyDrink(int money, int volume) {
        Iterator<Product> it = this.products.iterator();
        while (it.hasNext()) {
            Product p = it.next();
            if (p instanceof Drink) {
                Drink b = (Drink) p;
                if (b.getPrice() <= money && b.getVolume() >= volume) {
                    it.remove();
                    return b;
                }
            }
        }
        return null;
    }

    public void sortProducts() {
        this.products.sort(Comparator.comparingInt(Product::getPrice));
        for (Product p : this.products) {
            System.out.println(p);
        }
    }
}
