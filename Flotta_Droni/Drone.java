public abstract class Drone {
    String seriale; // univoca
    String modello; // senza spazi
    int livelloBatteria; // da 0 a 100, se valore inserito fuori range default 100

    public Drone (String seriale, String modello, int livelloBatteria) {
        this.seriale = seriale;
        this.modello = modello;
        if (livelloBatteria < 0 || livelloBatteria > 100) {
            this.livelloBatteria = 100;
        } else {
            this.livelloBatteria = livelloBatteria;
        }
    }

    public String getSeriale() {
        return this.seriale;
    }

    public String getModello() {
        return this.modello;
    }

    public int getLivello() {
        return this.livelloBatteria;
    }

    public void setLivello(int livelloBatteria) {
        this.livelloBatteria = livelloBatteria;
    }

    public String toString() {
        return("Drone " + this.seriale + ": {modello: " + this.modello + ", batteria: " + this.livelloBatteria + "}");
    }

}