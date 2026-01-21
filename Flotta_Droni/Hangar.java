import java.util.*;

public class Hangar {
    private List<Drone> listaDroni;
    private List<Drone> droniInviati;

    public Hangar() {
        this.listaDroni = new ArrayList<>();
        this.droniInviati = new ArrayList<>();
    }

    void aggiungiDrone(Drone d) {
        listaDroni.add(d);
    }

    void droneInviato(Drone d) {
        droniInviati.add(d);
    }

    DroneConsegna missioneConsegna(int pesoPacco, int batteriaMin) {
        for (int i=0; i < listaDroni.size(); i++) {
            Drone d = listaDroni.get(i);
            if (d instanceof DroneConsegna) {
                DroneConsegna dc = (DroneConsegna) d;
                if (dc.getCarico() >= pesoPacco && dc.getLivello() >= batteriaMin) {
                    listaDroni.remove(i);
                    droniInviati.add(dc);
                    System.out.println("Drone "+ dc.getSeriale() + " inviato in missione.");
                    return dc;
                }
            }
        }
        System.out.println("Nessun drone idoneo trovato.");
        return null;
    }

    DroneSorveglianza missioneSorveglianza(int risoluzione, int batteriaMin) {
        for (int i=0; i < listaDroni.size(); i++) {
            Drone d = listaDroni.get(i);
            if (d instanceof DroneSorveglianza) {
                DroneSorveglianza ds = (DroneSorveglianza) d;
                if (ds.getLivello() >= batteriaMin && ds.getRisoluzione() >= risoluzione) {
                    listaDroni.remove(i);
                    droniInviati.add(ds);
                    System.out.println("Drone "+ ds.getSeriale() + " inviato in missione.");
                    return ds;
                }
            }
        }
        System.out.println("Nessun drone idoneo trovato.");
        return null;
    }

    void rientra(String seriale) {
        Drone trovato = null;
        for (Drone d : droniInviati) {
            if (d.getSeriale().equals(seriale)) {
                trovato = d;
                break;
            }
        }
        if (trovato != null) {
            droniInviati.remove(trovato);
            trovato.setLivello(0);
            listaDroni.add(trovato);
            System.out.println("Drone " + seriale + " rientrato in Hangar (batteria: " + trovato.getLivello() + ").");
        } else {
            System.out.println("Drone " + seriale + " selezionato non in missione.");
        }
    }

    void carica(String seriale) {
        Drone trovato = null;
        for (Drone d : listaDroni) {
            if (d.getSeriale().equals(seriale)) {
                trovato = d;
                break;
            }
        }
        if (trovato != null) {
            if (trovato.getLivello() >= 100) {
                System.out.println("Il drone è già carico.\n");
            } else {
                trovato.setLivello(100);
                System.out.println("Drone " + trovato.getSeriale() + " caricato (batteria: " + trovato.getLivello() + ").");
            }
        } else {
            System.out.println("Drone " + seriale + "in missione. Impossibile caricarlo.");
        }
    }

    void stato() {
        System.out.println("Droni presenti nell'Hangar:");
        for (Drone d : listaDroni) {
            System.out.println(d.toString());
        }
        System.out.println("\nDroni in missione:");
        if (droniInviati.isEmpty()) {
            System.out.println("Nessun drone in missione.");
        } else { 
            for (Drone d : droniInviati) {
                System.out.println(d.toString());
            }
        }
    }

    void statoMissioni() {
        System.out.println("\nDroni in missione:");
        if (droniInviati.isEmpty()) {
            System.out.println("Nessun drone in missione.");
        } else { 
            for (Drone d : droniInviati) {
                System.out.println(d.toString());
            }
        } 
    }

}
