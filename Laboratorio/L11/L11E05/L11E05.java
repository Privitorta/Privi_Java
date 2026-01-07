package Laboratorio.L11.L11E05;
import java.util.Scanner;

public class L11E05 {

    public static void main(String []args){
        
        int a, sum=0, formula;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Inserisci numero: ");
            a = sc.nextInt();
        } while (a < 1);

        sc.close();

        for (int i=0; i <= a; i++){
            sum += (i*i*i);
        }

        // casting
        formula = ((int)Math.pow(a, 2)) * ((int)Math.pow(a+1, 2)) / 4;

        System.out.println("Sommatoria: "+ sum + " formula: " + formula);
    
    }

}