public abstract class Veicolo {
    private String targa;
    private String modello; // parola singola
    private int anno; // compreso tra 1800 e 2025 -> altrimenti default 2025
    private int numNoleggi = 0;

    public Veicolo(String targa, String modello, int anno) {
        this.targa = targa;
        this.modello = modello;
        if (anno > 2025 || anno < 1800) {
            this.anno = 2025;
        } else {
            this.anno = anno;
        }
    }

    public String getTarga() {
       return targa; 
    }

    public String getModello() {
        return modello;
    }

    public int getAnno() {
        return anno;
    }

    public int getNumNoleggi() {
        return numNoleggi;
    }

    public void incrementaNumNoleggi() {
        this.numNoleggi++;
    }

}