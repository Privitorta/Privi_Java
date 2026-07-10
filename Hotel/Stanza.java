public abstract class Stanza {
    int numero;
    int letti;
    String ospite;

    public Stanza(int numero, int letti, String ospite) {
        this.numero = numero;
        this.letti = letti;
        this.ospite = null;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getLetti() {
        return this.letti;
    }

    public String getOspite() {
        return this.ospite;
    }

    public void setOspite(String ospite) {
        this.ospite = ospite;
    }

}