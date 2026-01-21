public class DroneSorveglianza extends Drone {
    int risoluzione; // default: 1080, >720 <4000

    public DroneSorveglianza (String seriale, String modello, int livelloBatteria, int risoluzione) {
        super(seriale, modello, livelloBatteria);
        if (risoluzione < 720 || risoluzione > 4000) {
            this.risoluzione = 1080;
        } else {
            this.risoluzione = risoluzione;
        }
    }

    public int getRisoluzione() {
        return this.risoluzione;
    }

    public void setRisoluzione(int risoluzione) {
        this.risoluzione = risoluzione;
    } 

    @Override
    public String toString() {
        return super.toString() + " [risoluzione: " + this.risoluzione + "px]";
    }
}