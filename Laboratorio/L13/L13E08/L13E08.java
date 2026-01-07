package Laboratorio.L13.L13E08;
public class L13E08 {


    public static String invertFirstLast(String s) {
        char [] arr = s.toCharArray();
        char temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        return new String(arr);
    }

    public static void main(String[] args){

        String initial = "ciao, come va?";

        System.out.printf("Prima: '%s', dopo: '%s'\n", initial, invertFirstLast(initial));
    }
    
}
