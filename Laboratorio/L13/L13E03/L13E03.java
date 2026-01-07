package Laboratorio.L13.L13E03;
import java.util.Scanner;

public class L13E03 {

    public static int[] readArray(){
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

        return array;
    }

    public static void printArrayReversed(int[] array){
        for (int i = array.length - 1; i >= 0; i--){
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args){

        int[] array = readArray();

        printArrayReversed(array);

    }
}
