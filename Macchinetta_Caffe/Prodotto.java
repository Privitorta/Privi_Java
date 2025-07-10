/* classe astratta che descrive un prodotto venduto dalla macchinetta
il prodotto possiede due attributi: costo (un intero) e nome (una stringa)*/

public abstract class Prodotto{
    private int costo;
    private String nome;
    public Prodotto(int costo, String nome){
        this.costo = costo;
        this.nome = nome;
    }
    public int getCosto(){
        return costo;
    }
    public String getNome(){
        return nome;
    }
}