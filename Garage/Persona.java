public class Persona {
    String nome;
    Auto auto;

    public Persona(String nome, Auto auto) {
        this.nome = nome;
        this.auto = auto;
    }

    public String getNome() {
        return this.nome;
    }

    public Auto getAuto() {
        return this.auto;
    }

    public void parcheggia(Garage garage) {
        garage.aggiungiAuto(this.auto);
    }

    public void rimuoviAuto(Garage garage) {
        garage.rimuoviAuto(this.auto);
    }

    public String toString() {
        return "Proprietario ("+ this.nome + ", Macchina: " + auto.getModello() + ", Targa: " + auto.getTarga() + ")";
    }
}
