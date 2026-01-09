public class Auto extends Veicolo {
    int numeroPax; // 2 < numeroPax < 8, default 5

    public Auto(String targa, String modello, int anno, int numeroPax) {
        super(targa, modello, anno);
        if (numeroPax <= 2 || numeroPax >= 8) {
            this.numeroPax = 5;
        } else {
            this.numeroPax = numeroPax;
        }
    }

    public int getNumeroPax() {
        return this.numeroPax;
    }

    @Override
    public String toString() {
        return "Auto (Targa: " + this.getTarga() + ", Modello: " + this.getModello() + ", Anno immatricolazione: " + this.getAnno() + ", Passeggeri: " + this.numeroPax + ")";
    }
}