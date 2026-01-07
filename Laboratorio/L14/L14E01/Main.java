package Laboratorio.L14.L14E01;
public class Main {

    public static void main(String [] args){
        Contatore c1 = new Contatore();
        System.out.printf("Contatore iniziale: %d == 0 ? %b\n", c1.a, c1.a == 0);

        Contatore c2 = new Contatore(10);
        c2.inc();
        System.out.printf("Contatore iniziale: %d == 11 ? %b\n", c2.a, c2.a == 11);
    }
    
}
