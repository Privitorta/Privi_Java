import java.util.ArrayList;
public class Biblioteca{
    private ArrayList<Libro> libriDisponibili = new ArrayList<>();
    private ArrayList<Utente> utenti = new ArrayList<>();

    public void aggiungiLibro(Libro libro){
        libriDisponibili.add(libro);
    }
    public void registraUtente(Utente utente){
        utenti.add(utente);
    }
    public boolean prestaLibro(int idLibro, int idUtente){
        Libro libro = null;
        Utente utente = null;
        int removeIndex=0;
        for(int i=0;i<libriDisponibili.size();i++){
            if(idLibro == libriDisponibili.get(i).getId()){
                libro = libriDisponibili.get(i);
                removeIndex=i;
            }
        }

        for(int i=0;i<utenti.size();i++){
            if(idUtente == utenti.get(i).getId()){
                utente = utenti.get(i);
            }
        }

        if(libro!=null && utente!=null){
            utente.addLibro(libro);
            libriDisponibili.remove(removeIndex);
            System.out.println("Libro: "+ libro.toString()+" prestato a "+utente.toString());
            return true;
        }else{
            return false;
        }  
    }
    public boolean restituisciLibro(int idLibro, int idUtente){
        Utente utente = null;
        Libro rimosso = null;
        for(int i=0;i<utenti.size();i++){
            if(idUtente == utenti.get(i).getId()){
                utente = utenti.get(i);
            }
        }
        rimosso = utente.removeLibro(idLibro);
        if(rimosso !=null){
            aggiungiLibro(rimosso);
            System.out.println("Libro: "+ rimosso.toString()+" restituito da "+utente.toString());
            return true;
        }else{
            return false;
        }
        
    }
}