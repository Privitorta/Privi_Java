import java.util.*;

public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Noleggio noleggio = new Noleggio();

        Veicolo veicoloNoleggiato = null;

        System.out.println("ADDAuto: Inserisci nuova auto (uso: ADDAuto targa, modello, anno, numero passeggeri)");
        System.out.println("ADDMoto: Inserisci nuova moto (uso: ADDMoto targa, modello, anno, cavalli)");
        System.out.println("NAuto: Noleggia una auto (uso: NAuto numero passeggeri, anno)");
        System.out.println("NMoto: Noleggia una moto (uso: NMoto modello, cavalli)");
        System.out.println("R: Restituisci un veicolo");
        System.out.println("S: Lista di veicoli per anno di immatricolazione");
        System.out.println("L: Lista i veicoli disponibili.");
        System.out.println("END: Chiudi il noleggio");

        while(true) {
            System.out.println("Inserisci comando: ");
            String comando = scanner.next();

            switch(comando) {
                case "END": {
                    System.out.println("Chiusura noleggio...");
                    System.exit(0);
                }

                case "ADDAuto": {
                    String targa = scanner.next();
                    String modello = scanner.next();
                    int anno = scanner.nextInt();
                    int numeroPax = scanner.nextInt();
                    noleggio.aggiungiVeicolo(new Auto(targa, modello, anno, numeroPax));
                    System.out.println("Auto aggiunta.");
                    break;
                }

                case "ADDMoto": {
                    String targa = scanner.next();
                    String modello = scanner.next();
                    int anno = scanner.nextInt();
                    int cavalli = scanner.nextInt();
                    noleggio.aggiungiVeicolo(new Moto(targa, modello, anno, cavalli));
                    System.out.println("Moto aggiunta.");
                    break;   
                }

                case "NAuto": {
                    int numeroPax = scanner.nextInt();
                    int anno = scanner.nextInt();
                    Auto a = noleggio.noleggiaAuto(numeroPax, anno);
                    if (a != null) {
                        System.out.println("Auto noleggiata.");
                        System.out.println(a.toString());
                        veicoloNoleggiato = a;
                    } else {
                        System.out.println("Auto non trovata o non disponibile per il noleggio.");
                    }    
                    break;
                }

                case "NMoto": {
                    String modello = scanner.next();
                    int cavalli = scanner.nextInt();
                    Moto m = noleggio.noleggiaMoto(modello, cavalli);
                    if (m != null) {
                        System.out.println("Moto noleggiata.");
                        System.out.println(m.toString());
                        veicoloNoleggiato = m;
                    } else {
                        System.out.println("Moto non trovata o non disponibile per il noleggio.");
                    }    
                    break;
                }

                case "L": {
                    noleggio.stampaVeicoli();
                    break;
                }

                case "S": {
                    noleggio.sort();
                    break;
                }

                case "R": {
                    noleggio.restituisciVeicolo(veicoloNoleggiato);
                    break;
                }
            }
        }
    }
}
