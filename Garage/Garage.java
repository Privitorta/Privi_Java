import java.util.*;

public class Garage {
    List<Auto> parcheggio;

    public Garage() {
        this.parcheggio = new ArrayList<>();
    }

    public int aggiungiAuto(Auto auto) {
        for (Auto a : parcheggio) {
            if (auto.getTarga() == a.getTarga()) {
                System.out.println("\u001B[31mAuto già presente nel garage.\u001B[0m");
                return -1;
            }
        }
        parcheggio.add(auto);
        System.out.println("\u001B[32m" + auto.toString() + " aggiunta al garage.\u001B[0m");
        return 1;
    }

    public void rimuoviAuto(Auto auto) {
        boolean trovata = false;
        for (Auto a : parcheggio) {
            if (a.getTarga() == auto.getTarga()) {
                trovata = true;
                break;
            }
        }
        if (!trovata) {
            System.out.println("\u001B[31mLa persona scelta non ha ancora parcheggiato la sua auto nel garage.\u001B[0m");
            return;
        }
        
        parcheggio.removeIf(a -> a.getTarga() == (auto.getTarga()));
        System.out.println("\u001B[32m" + auto.toString() + " rimossa dal garage.\u001B[0m");
    }

    public void visualizzaAuto() {
        System.out.println("Auto presenti nel garage attualmente:");
        if (parcheggio.size() == 0) {
            System.out.println("\u001B[33mNessuna auto presente nel garage.\u001B[0m");
        } else {
            for (Auto a : parcheggio) {
                System.out.println(a.toString());
            }
        }
    }
}
