package Laboratorio.L14.L14E09_10;
public class Main {

    public static void main(String[] args){
        try {
            new Fraction(1, 0);
        } catch (IllegalArgumentException e) {
            System.out.printf("Bloccato giustamente!\n");
        }

        Fraction f1 = new Fraction(10, 5);
        Fraction f2 = new Fraction(2, 1);

        Fraction f1Simplified = f1.simplify();

        System.out.printf("Semplificazione: f1 == f1 == f1Simplified? %b\n", f1.equals(f2) && f1.equals(f1Simplified));

        System.out.printf("f1+f2=%s, f1*f2=%s\n", f1.add(f2), f1.multiply(f2));

    }
    
}
