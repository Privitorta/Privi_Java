public class Libro{
    private static int counter = 0;

    private int id;
    private String titolo;
    private String autore;

    Libro(String titolo, String autore){
        counter++;
        this.titolo=titolo;
        this.autore=autore;
        this.id = counter;
    }

    public int getId(){
        return this.id;
    }

    public String toString(){
        return this.id+ ": "+this.titolo + "--" + this.autore;
    }

}