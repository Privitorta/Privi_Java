import java.util.*;

public class Hotel {
    private List<Stanza> stanze;

    public Hotel() {
        this.stanze = new ArrayList<>();
    }

    void aggiungiStanza(Stanza stanza) {
        stanze.add(stanza);
    }
}
