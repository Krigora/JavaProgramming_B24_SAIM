package day24_loops;

public class CountHi {
    public static void main(String[] args) {

        String s = "aahiahiaaahh";

        int hiCounter = 0;

        for(int i = 0; i < s.length() - 1; i++){ //  i <= s.length() - 2

            if(s.charAt(i) == 'h' && s.charAt(i+1) == 'i'){
                hiCounter++;
            }

        }

        System.out.println("Hi counter: " + hiCounter);

        /*
         "aahiahiaaahh";
          aa
          ah
          hi
          ia
          ah
          hi
          ia
          aa
          aa
          ah
          hh -> 10, 11
            11 < 11




         */

    }
}
