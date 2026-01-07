package Laboratorio.L13.L13E05;
import java.util.Scanner;

public class L13E05 {

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

    public static void sortArray(int[] array){
        boolean scambio = true;
        int temp;
        while (scambio) {
            scambio = false;
            for (int i=0; i <= array.length - 2; i++){
                if (array[i] >array[i+1]){
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    scambio = true;   
                }
            }
        }
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args){

        int [] array = readArray();
        
        System.out.println("Non ordinato: ");
        printArray(array);

        sortArray(array);
        System.out.println("Ordinato: ");
        printArray(array);

    }
    
}
