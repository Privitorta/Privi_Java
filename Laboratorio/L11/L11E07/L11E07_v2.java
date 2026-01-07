package Laboratorio.L11.L11E07;
import java.util.Optional;
import java.util.Scanner;

public class L11E07_v2 {

    static final int INSERISCI_OPERANDI = 0;
    static final int ADDIZIONE = 1;
    static final int SOTTRAZIONE = 2;
    static final int MOLTIPLICAZIONE = 3;
    static final int DIVISIONE = 4;
    static final int ESCI = 5;

    public static double somma(double n1, double n2) {
        return n1 + n2;
    }

    public static double sottrazione(double n1, double n2) {
        return n1 - n2;
    }

    public static double moltiplicazione(double n1, double n2) {
        return n1 * n2;
    }

    public static double divisione(double n1, double n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        boolean operandiInseriti = false; // nuovo flag
        int choice;
        double n1 = 0, n2 = 0;

        Optional<Double> result = Optional.empty();

        while (!exit) {
            System.out.print("0. Inserisci operandi\n1. Addizione\n2. Sottrazione\n3. Moltiplicazione\n4. Divisione\n5. Esci\n> ");
            choice = sc.nextInt();

            switch (choice) {
                case INSERISCI_OPERANDI:
                    System.out.print("Inserisci il primo numero: ");
                    n1 = sc.nextDouble();
                    System.out.print("Inserisci il secondo numero: ");
                    n2 = sc.nextDouble();
                    operandiInseriti = true;
                    result = Optional.empty(); // reset result
                    break;

                case ADDIZIONE:
                    if (operandiInseriti) {
                        result = Optional.of(somma(n1, n2));
                    } else {
                        System.out.println("Errore: prima inserisci gli operandi (opzione 0).");
                    }
                    break;

                case SOTTRAZIONE:
                    if (operandiInseriti) {
                        result = Optional.of(sottrazione(n1, n2));
                    } else {
                        System.out.println("Errore: prima inserisci gli operandi (opzione 0).");
                    }
                    break;

                case MOLTIPLICAZIONE:
                    if (operandiInseriti) {
                        result = Optional.of(moltiplicazione(n1, n2));
                    } else {
                        System.out.println("Errore: prima inserisci gli operandi (opzione 0).");
                    }
                    break;

                case DIVISIONE:
                    if (operandiInseriti) {
                        if (n2 == 0) {
                            System.out.println("Divisore dev'essere != 0");
                        } else {
                            result = Optional.of(divisione(n1, n2));
                        }
                    } else {
                        System.out.println("Errore: prima inserisci gli operandi (opzione 0).");
                    }
                    break;

                case ESCI:
                    exit = true;
                    break;

                default:
                    System.out.println("Scelta non valida");
                    break;
            }

            // Print result if present
            if(result.isPresent()){
                System.out.printf("Risultato: %f%n", result.get());
            }
        }

        sc.close();
    }
}