import java.util.ArrayList;
public class Utente{
    private static int counter = 0;

    private int id;
    private String nome;
    private ArrayList<Libro> libriInPrestito = new ArrayList<>();

    Utente(String nome){
        counter++;
        this.nome=nome;
        this.id = counter;
    }

    public void addLibro(Libro libro){
        libriInPrestito.add(libro);
    }
    public int getNprestiti(){
        return libriInPrestito.size();
    }
    public Libro removeLibro(int idLibro){
        Libro ritorno;
        for(int i=0;i<libriInPrestito.size();i++){
            if(idLibro == libriInPrestito.get(i).getId()){
                ritorno = libriInPrestito.get(i);
                libriInPrestito.remove(i);
                return ritorno;
            }
        }
        return null;
    }
    public int getId(){
        return this.id;
    }

    public String toString(){
        return this.id+ ": "+this.nome;
    }
    
}