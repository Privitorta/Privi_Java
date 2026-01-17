import java.util.*;

public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GiocoDaTavolo gioco = new GiocoDaTavolo();
        int giocatoreCount = 1;
        int turnoCount = 1;

        System.out.println("\nGIOCO DA TAVOLO");
        System.out.println("ADDGIOCATORE: aggiungi giocatore");
        System.out.println("TURNO: gioca turno");
        System.out.println("END: termina l'esecuzione");

        while (true) {
            System.out.println("\nInserisci comando: ");
            System.out.print("> ");
            String comando = scanner.next();

            switch (comando) {
                
                case "END": {
                    System.out.println("Termino l'esecuzione");
                    System.exit(0);
                }

                case "ADDGIOCATORE": {
                    String nome;
                    if (scanner.hasNext()) {
                        nome = scanner.next();
                    } else {
                        System.out.print("Nome player " + giocatoreCount + ": ");
                        nome = scanner.next();
                    }
                    Giocatore giocatore = new Giocatore(giocatoreCount, nome);
                    gioco.aggiungiGiocatore(giocatore);
                    System.out.println("Giocatore " + giocatoreCount + " '" + nome + "' aggiunto.");
                    giocatoreCount++;
                    break;
                }

                case "TURNO": {
                    System.out.println("\nTurno " + turnoCount + ":");
                    if (gioco.partitaTerminata()) {
                        System.out.println("La partita è terminata!");
                    } else {
                        gioco.giocaTurno();
                        turnoCount++;
                    }
                    break;
                }

                default: {
                    System.out.println("Comando non valido.");
                    break;
                }
            }
        }
    }
}
