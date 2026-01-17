import java.util.*;

// ho messo i colori al Solver ma sono ovviamente facoltativi.

public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Noleggio noleggio = new Noleggio();

        Veicolo veicoloNoleggiato = null;

        System.out.println("\n\u001B[33mNOLEGGIO VEICOLI\u001B[0m\n");
        System.out.println("\u001B[33mL\u001B[0m: Lista i veicoli disponibili.");
        System.out.println("\u001B[33mADDAuto\u001B[0m: Inserisci nuova auto noleggiabile \u001B[34m(uso: ADDAuto targa, modello, anno, numero passeggeri)\u001B[0m");
        System.out.println("\u001B[33mADDMoto\u001B[0m: Inserisci nuova moto noleggiabile \u001B[34m(uso: ADDMoto targa, modello, anno, cavalli)\u001B[0m");
        System.out.println("\u001B[33mNAuto\u001B[0m: Noleggia una auto tra le disponibili \u001B[34m(uso: NAuto numero passeggeri, anno)\u001B[0m");
        System.out.println("\u001B[33mNMoto\u001B[0m: Noleggia una moto tra le disponibili \u001B[34m(uso: NMoto modello, cavalli)\u001B[0m");
        System.out.println("\u001B[33mR\u001B[0m: Restituisci il veicolo noleggiato.");
        System.out.println("\u001B[33mS\u001B[0m: Lista i veicoli disponibili per anno di immatricolazione.");
        System.out.println("\u001B[33mEND\u001B[0m: Chiudi il noleggio");

        while(true) {
            System.out.println("\n\u001B[34mInserisci comando:"); System.out.print("> \u001B[0m");
            String comando = scanner.next();

            switch(comando) {
                case "END": {
                    System.out.println("\u001B[33mChiusura noleggio\u001B[0m");
                    System.exit(0);
                }

                case "ADDAuto": {
                    System.out.print("\u001B[33mTarga: \u001B[0m");
                    String targa = scanner.next();
                    System.out.print("\u001B[33mModello: \u001B[0m");
                    String modello = scanner.next();
                    System.out.print("\u001B[33mAnno di immatricolazione: \u001B[0m");
                    int anno = scanner.nextInt();
                    System.out.print("\u001B[33mNumero passeggeri (massimo): \u001B[0m");
                    int numeroPax = scanner.nextInt();
                    noleggio.aggiungiVeicolo(new Auto(targa, modello, anno, numeroPax));
                    System.out.println("\u001B[32mAuto aggiunta.\u001B[0m");
                    break;
                }

                case "ADDMoto": {
                    System.out.print("\u001B[33mTarga: \u001B[0m");
                    String targa = scanner.next();
                    System.out.print("\u001B[33mModello: \u001B[0m");
                    String modello = scanner.next();
                    System.out.print("\u001B[33mAnno di immatricolazione: \u001B[0m");
                    int anno = scanner.nextInt();
                    System.out.print("\u001B[33mCavalli: \u001B[0m");
                    int cavalli = scanner.nextInt();
                    noleggio.aggiungiVeicolo(new Moto(targa, modello, anno, cavalli));
                    System.out.println("\u001B[32mMoto aggiunta.\u001B[0m");
                    break;   
                }

                case "NAuto": {
                    System.out.print("\u001B[33mNumero passeggeri (minimo): \u001B[0m");
                    int numeroPax = scanner.nextInt();
                    System.out.print("\u001B[33mAnno di immatricolazione (minimo): \u001B[0m");
                    int anno = scanner.nextInt();
                    Auto a = noleggio.noleggiaAuto(numeroPax, anno);
                    if (a != null) {
                        System.out.println("\u001B[32mAuto noleggiata.\u001B[0m");
                        System.out.println(a.toString());
                        veicoloNoleggiato = a;
                    } else {
                        System.out.println("\u001B[31mAuto non trovata o non disponibile per il noleggio.\u001B[0m");
                    }    
                    break;
                }

                case "NMoto": {
                    System.out.print("\u001B[33mModello: \u001B[0m");
                    String modello = scanner.next();
                    System.out.print("\u001B[33mCavalli (minimo): \u001B[0m");
                    int cavalli = scanner.nextInt();
                    Moto m = noleggio.noleggiaMoto(modello, cavalli);
                    if (m != null) {
                        System.out.println("\u001B[32mMoto noleggiata.\u001B[0m");
                        System.out.println(m.toString());
                        veicoloNoleggiato = m;
                    } else {
                        System.out.println("\u001B[31mMoto non trovata o non disponibile per il noleggio.\u001B[0m");
                    }    
                    break;
                }

                case "L": {
                    System.out.println("\u001B[33mLista veicoli disponibili per il noleggio:\u001B[0m");
                    noleggio.stampaVeicoli();
                    break;
                }

                case "S": {
                    System.out.println("\u001B[33mLista veicoli disponibili per anno di immatricolazione:\u001B[0m");
                    noleggio.sort();
                    break;
                }

                case "R": {
                    noleggio.restituisciVeicolo(veicoloNoleggiato);
                    System.out.println("\u001B[32mVeicolo restituito.\u001B[0m");
                    System.out.println(veicoloNoleggiato.toString());
                    break;
                }
                default: {
                    System.out.println("\u001B[31mComando non riconosciuto. Riprovare.\u001B[0m");
                    break;
                }
            }
        }
    }
}
