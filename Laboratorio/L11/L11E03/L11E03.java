package Laboratorio.L11.L11E03;
import java.util.Scanner;

public class L11E03 {

    public static void main(String []args){
        
        int a, sum=0, formula;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Inserisci numero: ");
            a = sc.nextInt();
        } while (a < 1);

        sc.close();

        for (int i=0; i <= a; i++){
            sum += i;
        }

        formula = a*(a+1)/2;

        System.out.println("Sommatoria: "+ sum + " formula: " + formula);
    
    }

}