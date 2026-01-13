import java.util.*;

public class Main {

    // Funzione non richiesta di utilità
    public static Persona cercaPersona(List<Persona> persone, String nome) {
        for (Persona p : persone) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\u001B[33mBenvenuto nel Parcheggio/Garage!");

        System.out.println("\n\u001B[34mInserisci il numero N di persone:");
        System.out.print("> \u001B[0m");
        int N = scanner.nextInt();

        List<Persona> persone = new ArrayList<>();
        Garage garage = new Garage();

        int counterTarga = 100;
        for (int i=0; i<N; i++) {
            System.out.println("\u001B[34mInserisci il nome della persona \u001B[32m" + (i+1) + "\u001B[34m: \u001B[0m");
            String nome = scanner.next();
            System.out.println("\u001B[32m" + nome + " è la persona numero " + (i+1) + ".");

            System.out.println("\u001B[34mInserisci il modello dell'auto: \u001B[0m");
            String modello = scanner.next();
            Auto auto = new Auto(modello, counterTarga++);
            persone.add(new Persona(nome, auto));
            System.out.println("\u001B[32m" + modello + " è il modello auto di " + nome + " con targa " + auto.targa + ".");
        }

        System.out.println("\n\u001B[33mE (nome): la persona entra nel garage");
        System.out.println("U (nome): la persona esce dal garage");
        System.out.println("V: visualizza i veicoli parcheggiati");
        System.out.println("F: chiudi il programma");

        while(true) {
            System.out.println("\n\u001B[34mInserisci comando:");
            System.out.print("> \u001B[0m");
            String comando = scanner.next();

            switch(comando) {
                case "F": {
                    System.out.println("\u001B[31mTerminazione programma.\u001B[0m");
                    System.exit(0);
                }

                case "E": {
                    String nome = scanner.next();
                    Persona chiEntra = cercaPersona(persone, nome);
                    if (chiEntra != null) {
                        chiEntra.parcheggia(garage);
                        garage.visualizzaAuto();
                    } else {
                        System.out.println("\u001B[31mPersona non registrata.\u001B[0m");
                    }
                    break;
                }

                case "U": {
                    String nome = scanner.next();
                    Persona chiEsce = cercaPersona(persone, nome);
                    if (chiEsce != null) {
                        chiEsce.rimuoviAuto(garage);
                        garage.visualizzaAuto();
                    } else {
                        System.out.println("\u001B[31mPersona non registrata.\u001B[0m");
                    }
                    break;
                }

                case "V": {
                    garage.visualizzaAuto();
                    break;
                }

                default: {
                    System.out.println("\u001B[31mComando non valido.\u001B[0m");
                }
            }
        }
    }
}
