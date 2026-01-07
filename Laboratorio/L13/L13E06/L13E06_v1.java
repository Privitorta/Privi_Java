package Laboratorio.L13.L13E06;
import java.util.Scanner;

public class L13E06_v1 {

    public static String toLower(String s){
        char[] arr = new char[s.length()];
        // char c;
        for (int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
            // trasformazione in maiuscola.
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - ('a' - 'A'));
            }
        }
        return new String(arr);
    }

    public static void main(String[] args){
        String s, sUpper;
        System.out.print("Stringa: ");
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        sc.close();

        sUpper = toLower(s);
        System.out.println("Maiuscola: " + s + "\nMinuscola: " + sUpper);

    }
    
}
