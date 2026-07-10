public class Standard extends Stanza {
    public Standard(int numero, int letti, String ospite) {
        super(numero, letti, ospite);
    }

    public String toString() {
        return("Standard: {numero:"+this.numero+", letti:"+this.letti+", ospite:"+this.ospite+"}");
    }
}
