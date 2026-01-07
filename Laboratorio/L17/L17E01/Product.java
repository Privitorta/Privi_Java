package Laboratorio.L17E01;
public abstract class Product implements Comparable<Product> {
    protected int price;
    protected String name;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String toString() { return name + " (" + price + ")"; }
    public String getName() { return name; }
    public int getPrice() { return price; }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.price, other.price);
    }
}
