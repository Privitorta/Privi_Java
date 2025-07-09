import java.util.*;

class Cliente {
    private int id;
    private String nome;
    private List<Disco> dischiPresi;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.dischiPresi = new ArrayList<>();
    }

    public void prendiDisco(Disco disco) {
        dischiPresi.add(disco);
    }

    public boolean restituisciDisco(int idDisco) {
        return dischiPresi.removeIf(d -> d.getId() == idDisco);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nome='" + nome + "', dischiPresi=" + dischiPresi + "}";
    }
}