package Laboratorio.L13.L13E09;
public class L13E09 {

    public static String reverse(String s){
        char [] arr = new char[s.length()];
        for (int i = arr.length-1, j = 0; i>=0; i--, j++){
            arr[i] = s.charAt(j);
        }
        return new String(arr);
    }
    
    public static void main(String[] args){
        String initial = "PROGRAMMAZIONE";
        System.out.printf("prima: '%s', dopo: '%s'\n", initial, reverse(initial));
    }

}
