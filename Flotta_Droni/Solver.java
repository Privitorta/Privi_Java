import java.util.*;

public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hangar hangar = new Hangar();

        System.out.println("\nGESTIONE HANGAR\n");
        System.out.println("DC [seriale][modello][batteria][carico]: registra un drone consegna");
        System.out.println("DS [seriale][modello][batteria][risoluzione]: registra un drone sorveglianza");
        System.out.println("MC [peso(kg)][batteria]: manda in missione di consegna un drone carico");
        System.out.println("MS [batteria]: manda in missione di sorveglianza un drone carico");
        System.out.println("C [seriale]: carica un drone scarico");
        System.out.println("R [seriale]: riporta alla base un drone in missione");
        System.out.println("STATO: vedi lo stato di tutti i droni");
        System.out.println("MISSIONI: vedi i droni in missione");
        System.out.println("END: esci");

        while(true) {
            System.out.println("\nInserisci comando: ");
            System.out.print("> ");
            String comando = scanner.next();

            switch(comando) {
                case "END": {
                    System.out.println("Esco dall'Hangar...");
                    System.exit(0);
                }
                case "DC": {
                    System.out.print("Seriale: ");
                    String seriale = scanner.next();
                    System.out.print("Modello: ");
                    String modello = scanner.next();
                    System.out.print("Batteria: ");
                    int livelloBatteria = scanner.nextInt();
                    System.out.print("Carico: ");
                    int caricoMax = scanner.nextInt();
                    hangar.aggiungiDrone(new DroneConsegna(seriale, modello, livelloBatteria, caricoMax));
                    System.out.println("Drone consegna aggiunto.");
                    break;
                }
                case "DS": {
                    System.out.print("Seriale: ");
                    String seriale = scanner.next();
                    System.out.print("Modello: ");
                    String modello = scanner.next();
                    System.out.print("Batteria: ");
                    int livelloBatteria = scanner.nextInt();
                    System.out.print("Risoluzione: ");
                    int risoluzione = scanner.nextInt();
                    hangar.aggiungiDrone(new DroneSorveglianza(seriale, modello, livelloBatteria, risoluzione));
                    System.out.println("Drone sorveglianza aggiunto.");
                    break;  
                }
                case "MC": {
                    System.out.print("Peso del pacco da portare: ");
                    int pesoPacco = scanner.nextInt();
                    System.out.print("Minimo batteria richiesta: ");
                    int batteriaMin = scanner.nextInt();
                    hangar.missioneConsegna(pesoPacco, batteriaMin);
                    break;
                }
                case "MS": {
                    System.out.print("Minimo risoluzione richiesta: ");
                    int risoluzione = scanner.nextInt();
                    System.out.print("Minimo batteria richiesta: ");
                    int batteriaMin = scanner.nextInt();
                    hangar.missioneSorveglianza(risoluzione, batteriaMin);
                    break;
                }
                case "STATO": {
                    hangar.stato();
                    break;
                }
                case "R": {
                    hangar.statoMissioni();
                    System.out.print("\nSeriale drone da riportare: ");
                    String seriale = scanner.next();
                    hangar.rientra(seriale);
                    break;
                }
                case "C" : {
                    System.out.print("Seriale drone da caricare: ");
                    String seriale = scanner.next();
                    hangar.carica(seriale);
                    break;
                }
                case "MISSIONI": {
                    hangar.statoMissioni();
                    break;
                }
                default: {
                    System.out.println("Comando non valido!");
                }
            }
        }
    }
}
