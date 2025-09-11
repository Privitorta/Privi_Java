import java.util.*;

// attributi richiesti:
    // - catalogoFilm: lista di oggetti di tipo Film
        // contiene tutti i film presenti nella videoteca
    // - clienti: lista di oggetti di tipo Cliente
        // contiene tutti i clienti registrati nella videoteca

//metodi richiesti:
    // - aggiungiFilm(Film film)
        // aggiunge un nuovo film al catalogo
    // - registraCliente(Cliente cliente)
        // registra un nuovo cliente nella videoteca
    // - noleggiaFilm(int idFilm, int idCliente)
        // assegna un film a un cliente identificato da idCliente, se disponibile
    // - restituisciFilm(int idFilm, int idCliente)
        // permette al cliente di restituire un film noleggiato precedentemente

public class Videoteca {
    // attributi richiesti
    private List<Film> catalogoFilm; 
    private List<Cliente> clienti;
    
    // costruttore: ogni volta che creo un oggetto Videoteca, eseguirà il costruttore e partirà con due liste vuote
    public Videoteca() {
        this.catalogoFilm = new ArrayList<>(); // lista film vuota
        this.clienti = new ArrayList<>(); // lista clienti vuota
    }

    // metodi richiesti
    public void aggiungiFilm(Film film){
        catalogoFilm.add(film);
    }

    public void registraCliente(Cliente cliente){
        clienti.add(cliente);
    }

    public boolean noleggiaFilm(int idFilm, int idCliente){
        Film film = null;
        for (Film f : catalogoFilm){
            if (f.getId() == idFilm){
                film = f;
                break;
            }
        }
        if(film == null) return false;
        Cliente cliente = null;
        for (Cliente c : clienti){
            if (c.getId() == idCliente){
                cliente = c;
                break;
            }
        }
        if(cliente == null) return false;
        cliente.noleggiaFilm(film);
        return true;
    }

    public boolean restituisciFilm(int idFilm, int idCliente){
        Cliente cliente = null;
        for(Cliente c : clienti){
            if(c.getId() == idCliente){
                cliente = c;
                break;
            }
        }
        if(cliente == null) return false;
        return cliente.restituisciFilm(idFilm);
    }
}