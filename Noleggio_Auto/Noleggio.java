import java.util.*;

public class Noleggio {
    private List<Veicolo> listaVeicoli;

    public Noleggio() {
        listaVeicoli = new ArrayList<>();
    }

    public void aggiungiVeicolo(Veicolo v) {
        listaVeicoli.add(v);
    }

    public Auto noleggiaAuto(int numeroPax, int anno) {
        for (Veicolo v : listaVeicoli) {
            if (v instanceof Auto) {
                Auto a = (Auto) v;
                if (a.getNumeroPax() >= numeroPax && a.getAnno() >= anno) {
                    listaVeicoli.remove(a);
                    return a;
                }
            }
        }
        return null;
    }

    public Moto noleggiaMoto(String modello, int cavalli) {
        for (Veicolo v : listaVeicoli) {
            if (v instanceof Moto) {
                Moto m = (Moto) v;
                if (m.getCavalli() >= cavalli) {
                    listaVeicoli.remove(m);
                    return m;
                }
            }
        }
        return null;
    }

    public void restituisciVeicolo(Veicolo v) {
        v.incrementaNumNoleggi();
        aggiungiVeicolo(v);
    }

    public void stampaVeicoli() {
        for (Veicolo v : listaVeicoli) {
            System.out.println(v.toString());
        }
    }

    public void sort() {
        // ordina prodotti per ordine crescente di anno di immatricolazione
        Collections.sort(listaVeicoli, new Comparator<Veicolo>() {
            @Override
            public int compare(Veicolo v1, Veicolo v2) {
                return Integer.compare(v1.getAnno(), v2.getAnno());
            }
        });
        this.stampaVeicoli();
    }

}