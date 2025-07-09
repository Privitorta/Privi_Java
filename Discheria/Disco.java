class Disco {
    private int id;
    private String titolo;
    private String artista;

    public Disco(int id, String titolo, String artista) {
        this.id = id;
        this.titolo = titolo;
        this.artista = artista;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Disco{id=" + id + ", titolo='" + titolo + "', artista='" + artista + "'}";
    }
}