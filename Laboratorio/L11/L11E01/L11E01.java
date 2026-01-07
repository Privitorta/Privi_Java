package Laboratorio.L11.L11E01;
public class L11E01 {

	public static void main(String []args){
		int a=214, b=128; //Deve essere a,b > 0
		System.out.printf("Il m.c.d. di %d e %d e': ",a, b);
	
		while (a != b)  
		if (a > b)      //Se a > b,
			a = a-b;    //sostituisci a con a-b.
		else            //Altrimenti,
			b = b-a;    //sostituisci b con b-a.

		System.out.printf("%d\n", a);
	}

}