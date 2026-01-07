package Laboratorio.L11.L11E02;
import java.util.Scanner;

public class L11E02 {

	public static void main(String []args){
		int a, b, cont = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Primo numero: ");
            a = sc.nextInt();

            System.out.print("Secondo numero: ");
            b = sc.nextInt();
        } while (a <= 0 || b <= 0);

        sc.close();

        System.out.printf("Il m.c.d. di %d e %d e': ",a, b);
	
		while (a != b) {
            if (a > b)      //Se a > b,
                a = a-b;    //sostituisci a con a-b.
            else            //Altrimenti,
                b = b-a;    //sostituisci b con b-a.
            cont++;
        }

		System.out.printf("%d, con %d iterazioni\n", a, cont);
	}

}