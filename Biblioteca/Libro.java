public class Libro {
    private int id;
    private String titolo;
    private String autore;

    public Libro(int id, String titolo, String autore) {
        this.id = id;
        this.titolo = titolo;
        this.autore = autore;
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    @Override
    public String toString() {
        return "[" + id + "] '" + titolo + "' di " + autore;
    }
}