public class Giocatore {
    private int id;
    private String nome;
    private int posizione;

    public Giocatore(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.posizione = 0;
    }

    public int getId() { 
        return id; 
    }

    public int getPosizione() { 
        return posizione; 
    }

    public void setPosizione(int posizione) { 
        this.posizione = posizione; 
    }

    public String getNome() { 
        return nome;
    }

    @Override
    public String toString() {
        return "Giocatore {id=" + id + ", nome='" + nome + "', posizione=" + posizione + "}";
    }
}