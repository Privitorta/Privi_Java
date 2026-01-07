package Laboratorio.L13.L13E01;
import java.util.Scanner;

public class L13E01 {
    public static void main(String[] args){

        int [] array;
        int length;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci numero di elementi: ");
        length = sc.nextInt();

        array = new int[length];

        for (int i = 0; i < length; i++){
            System.out.print(i + "-esimo elemento: ");
            array[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < array.length; i++){
            System.out.printf("%d ", array[i]);
        }

        System.out.println();
    }
}
