// Classe Film
class Film {
    private int id;
    private String titolo;
    private String genere;

    public Film(int id, String titolo, String genere) {
        this.id = id;
        this.titolo = titolo;
        this.genere = genere;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Film{id=" + id + ", titolo='" + titolo + "', genere='" + genere + "'}";
    }
}