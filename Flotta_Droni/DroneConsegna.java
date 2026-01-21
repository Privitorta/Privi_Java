public class DroneConsegna extends Drone {
    int caricoMax; // default: 1000, >500 e <5000

    public DroneConsegna (String seriale, String modello, int livelloBatteria, int caricoMax) {
        super(seriale, modello, livelloBatteria);
        if (caricoMax < 500 || caricoMax > 5000) {
            this.caricoMax = 1000;
        } else {
            this.caricoMax = caricoMax;
        }
    }

    public int getCarico() {
        return this.caricoMax;
    }

    public void setCarico(int caricoMax) {
        this.caricoMax = caricoMax;
    }

    @Override
    public String toString() {
        return super.toString() + " [carico: " + this.caricoMax + "kg]";
    }
}
