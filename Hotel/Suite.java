public class Suite extends Stanza {
    int ambienti;

    public Suite(int numero, int letti, String ospite, int ambienti) {
        super(numero, letti, ospite);
        if (this.ambienti < 2) {
            this.ambienti = 2;
        } else {
            this.ambienti = ambienti;
        }
    }

    public int getAmbienti() {
        return this.ambienti;
    }

    public String toString() {
        return("Suite: {numero:"+this.numero+", letti:"+this.letti+", ambienti:"+this.ambienti+", ospite:"+this.ospite+"}");
    }
}
