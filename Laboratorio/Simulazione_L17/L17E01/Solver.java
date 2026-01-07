package Laboratorio.Simulazione_L17.L17E01;
import java.util.Scanner;

public class Solver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VendingMachine m = new VendingMachine();

        int soldi = 0;

        while (sc.hasNext()) {
            String cmd = sc.next();
            if (cmd.equals("B")) {
                // aggiungi bevanda
                m.addProduct(new Drink(sc.next(), sc.nextInt(), sc.nextInt()));
            }
            else if (cmd.equals("M")) {
                // aggiungi merendina
                m.addProduct(new Snack(sc.next(), sc.nextInt(), sc.nextInt()));
            } else if (cmd.equals("S")) {
                // deposita soldi
                int add = sc.nextInt();
                soldi += add;
            } else if (cmd.equals("CB")) {
                // compra bevanda
                Drink b = m.buyDrink(soldi, sc.nextInt());
                if (b != null) {
                    System.out.println("Ho bevuto " + b.getName());
                    soldi -= b.getPrice();
                }
            } else if (cmd.equals("CM")) {
                // compra merendina
                Snack mer = m.buySnack(soldi, sc.nextInt());
                if (mer != null) {
                    System.out.println("Ho mangiato " + mer.getName());
                    soldi -= mer.getPrice();
                }
            } else if (cmd.equals("SORT")) {
                m.sortProducts();
            } else if (cmd.equals("F")) {
                break;
            }
        }
        sc.close();
    }
}