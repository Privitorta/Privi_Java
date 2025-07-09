import java.util.Scanner;
public class Solver{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Biblioteca b = new Biblioteca();
        String input = "";
        String[] split;
        Libro libro;
        Utente utente;
        while(!input.equals("END")){
            System.out.println("Inserisci comando: ");
            input = s.nextLine();
            split = input.split(" ");
            switch(split[0]){
                case "ADDLIBRO":
                    libro = new Libro(split[1], split[2]);
                    b.aggiungiLibro(libro);
                    System.out.println("Libro inserito: "+libro.toString());
                break;
                case "ADDUTENTE":
                    utente = new Utente(split[1]);
                    b.registraUtente(utente);
                    System.out.println("Utente inserito: "+utente.toString());
                break;
                case "PRESTA":
                    if(!b.prestaLibro(Integer.parseInt(split[1]),Integer.parseInt(split[2]))){
                        System.out.println("Operazione non riuscita");
                    }
                break;
                case "RESTITUISCI":
                    if(!b.restituisciLibro(Integer.parseInt(split[1]),Integer.parseInt(split[2]))){
                        System.out.println("Operazione non riuscita");
                    }
                break;
                default:
                    System.out.println("Operazione non riuscita");
                break;
            }
        }
    }
}