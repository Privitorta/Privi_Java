package Laboratorio.L13.L13E04;
import java.util.Scanner;

public class L13E04 {

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

    public static int[] reverse(int[] array){
        int [] newArray = new int[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--, j++){
            newArray[j] = array[i];
        }
        return newArray;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args){

        int[] array = readArray();
        int [] reversed = reverse(array);
        System.out.println("Array originale: ");
        printArray(array);
        System.out.println("Array invertito: ");
        printArray(reversed);

    }
}
