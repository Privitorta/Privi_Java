package Laboratorio.L13.L13E10;
public class L13E10 {

    public static boolean isPalindroma(String s){
        boolean palindroma = true;
        for (int i = s.length()-1, j = 0; j < i && palindroma; i--, j++){
            if (s.charAt(i) != s.charAt(j)) {
                palindroma = false;
            }
        }
        return palindroma;
    }

    public static void main(String[] args){
        String palindroma = "TENET";
        String nonPalindroma = "TEMNET";
        System.out.printf("palindroma: %b, non-palindroma: %b\n", isPalindroma(palindroma), isPalindroma(nonPalindroma));
    }
    
}
