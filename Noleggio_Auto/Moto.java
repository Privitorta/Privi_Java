public class Moto extends Veicolo {
    int cavalli; // 200 < cavalli < 2000, 1000 default

    public Moto(String targa, String modello, int anno, int cavalli) {
        super(targa, modello, anno);
        if (cavalli <= 200 || cavalli >= 2000) {
            this.cavalli = 1000;
        } else {
            this.cavalli = cavalli;
        }
    }

    public int getCavalli() {
        return cavalli;
    }

    @Override
    public String toString() {
        return "Moto (Targa: " + this.getTarga() + ", Modello: " + this.getModello() + ", Anno immatricolazione: " + this.getAnno() + ", Cavalli: " + this.cavalli + ")";
    }
}
