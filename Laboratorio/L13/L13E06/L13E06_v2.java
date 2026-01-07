package Laboratorio.L13.L13E06;
import java.util.Scanner;

public class L13E06_v2 {


    public static void main(String[] args){
        String s;
        System.out.print("Stringa: ");
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        sc.close();

        System.out.println("Maiuscola: " + s + "\nMinuscola: " + s.toUpperCase());
    }
    
}
