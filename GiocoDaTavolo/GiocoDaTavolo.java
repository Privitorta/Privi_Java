import java.util.*;

public class GiocoDaTavolo {
    private List<Giocatore> giocatori; // lista contenente i giocatori iscritti alla partita
    public int caselleTotali = 30; // numero totale di caselle del tabellone

    public GiocoDaTavolo() {
        this.giocatori = new ArrayList<>();
    }

    public void aggiungiGiocatore(Giocatore giocatore) {
        giocatori.add(giocatore);
    }

    boolean partitaTerminata() {
        // restituisce true se un giocatore ha vinto, false altrimenti
        for (Giocatore g : giocatori) {
            if (g.getPosizione() >= caselleTotali) {
                return true;
            }
        }
        return false;
    }

    // ad ogni turno un giocatore lancia il dado e avanza della quantità indicata
    // l'ordine dei turni deve rispettare l'ordine di inserimento dei giocatori
    // vince il primo giocatore che raggiunge o supera la casella finale
    
    public void giocaTurno() {
        Dado dado = new Dado();
        for (Giocatore g : giocatori) {
            int lancio = dado.lancia();
            int nuovaPosizione = g.getPosizione() + lancio;
            g.setPosizione(nuovaPosizione);
            if (g.getPosizione() >= caselleTotali) {
                System.out.println(g.getNome() + " ha vinto la partita raggiungendo la posizione " + g.getPosizione() + "!");
                return;
            }
            System.out.println(g.getNome() + " ha lanciato il dado e ottenuto " + lancio + ". Nuova posizione: " + g.getPosizione());
        }
    }
}