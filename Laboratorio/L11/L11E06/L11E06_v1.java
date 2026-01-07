package Laboratorio.L11.L11E06;
import java.util.Scanner;

public class L11E06_v1 {

    static final char ADDIZIONE = 1;
    static final char SOTTRAZIONE = 2;
    static final char MOLTIPLICAZIONE = 3;
    static final char DIVISIONE = 4;
    static final char ESCI = 5; 

    public static double somma(double n1, double n2){
        return n1 + n2;
    }

    public static double sottrazione(double n1, double n2){
        return n1 - n2;
    }

    public static double moltiplicazione(double n1, double n2){
        return n1 * n2;
    }

    public static double divisione(double n1, double n2){
        return n1 / n2;
    }


    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        boolean operazioneEseguita;
        int choice;
        double n1, n2, result = 0.0; /* assegno a result
        per evitare errori di compilazione */

        System.out.print("Inserisci il primo numero: ");
        n1 = sc.nextDouble();
        System.out.print("Inserisci il secondo numero: ");
        n2 = sc.nextDouble();

        while (!exit){

            operazioneEseguita = false;

            System.out.print("1. Addizione\n2. Sottrazione\n3. Moltiplicazione\n4. Divisione\n5. Esci\n> ");

            choice = sc.nextInt();

            switch(choice){
                case ADDIZIONE:
                    result = somma(n1, n2);
                    operazioneEseguita = true;
                    break;
                case SOTTRAZIONE:
                    result = sottrazione(n1, n2);
                    operazioneEseguita = true;
                    break;
                case MOLTIPLICAZIONE:
                    result = moltiplicazione(n1, n2);
                    operazioneEseguita = true;
                    break;
                case DIVISIONE:
                    if (n2 == 0){
                        System.out.println("Divisore dev'essere != 0");
                    } else {
                        result = divisione(n1, n2);
                        operazioneEseguita = true;
                    }
                    break;
                case ESCI:
                    operazioneEseguita = false;
                    exit = true;
                    break;
                default:
                    operazioneEseguita = false;
                    System.out.println("Scelta non valida");
                    break;
            }

            if (operazioneEseguita) {
                System.out.printf("Risultato: %f\n", result);
            }
        }

        sc.close();

    }

}