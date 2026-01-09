/* sottoclasse di Prodotto che rappresenta una bevanda
   possiede l'attributo addizionale volume (un intero) */

public class Bevanda extends Prodotto{
    private int volume;

    public Bevanda(int costo, String nome, int volume){
        super(costo, nome);
        this.volume = volume;
    }
    
    public int getVolume(){
        return volume;
    }
}
