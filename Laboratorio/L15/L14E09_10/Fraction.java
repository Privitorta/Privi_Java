package Laboratorio.L14.L14E09_10;
// import javax.imageio.plugins.tiff.FaxTIFFTagSet;

public class Fraction {

    private int num;
    private int den;
    private double value;

    public Fraction(int num, int den){
        if (den == 0){
            throw new IllegalArgumentException("den != 0");
        }
        int [] result = Fraction.simplify(num, den);
        this.num = result[0];
        this.den = result[1];
        this.value = this.num / this.den;
    }

    public Fraction add(Fraction other){
        return new Fraction(this.num * other.den + other.num * this.den, this.den * other.den);
    }

    public Fraction multiply(Fraction other){
        return new Fraction(this.num * other.num, this.den * other.den);
    }

    public String toString(){
        return String.format("%d/%d", this.num, this.den);
    }

    public boolean gt(Fraction other){
        return this.value > other.value;
    }

    public boolean lt(Fraction other){
        return this.value < other.value;
    }

    public boolean equals(Fraction other){
        return this.value == other.value;
    }

    public Fraction invert(){
        return new Fraction(this.den, this.num);
    }

    public Fraction simplify(){
        int [] result = Fraction.simplify(this.num, this.den);
        return new Fraction(result[0], result[1]);
    }

    private static int[] simplify(int num, int den){
        // statico così lo uso nel costruttore.
        if (num == 0){
            return new int[]{0, 1};
        }
        int div = mcd(num, den);
        return new int[]{num/div, den/div};
    }

    public static int mcd(int a, int b) {
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("a o b negativi");
        }

        // Algoritmo di Euclide
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
}
