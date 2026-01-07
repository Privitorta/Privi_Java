package Laboratorio.L14.L14E03_8;
public class TestCopy {
    
    public static void main(String[]args){

        Circle c1 = new Circle(new Vector(0, 0), 1);
        Circle c2 = c1.copy();

        // c1 e c2 contengono copie di Vector per via di come
        // abbiamo implementato il metodo copy.
        // Lo verifico con == che controlla i puntatori.
        System.out.printf("c1.center == c2.center? %b\n", c1.getCenter() == c2.getCenter());

    }

}
