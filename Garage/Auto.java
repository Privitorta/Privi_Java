public class Auto {
    String modello;
    int targa;

    public Auto(String modello, int targa) {
        this.modello = modello;
        this.targa = targa;
    }

    public String getModello() {
        return this.modello;
    }

    public int getTarga() {
        return this.targa;
    }

    public String toString() {
        return "Auto (Targa: " + this.targa + ", Modello: " + this.modello + ")";
    }
}