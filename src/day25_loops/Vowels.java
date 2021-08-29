package day25_loops;

public class Vowels {

    public static void main(String[] args) {

        String s = "java is great";

        int count = 0;
        String vowels = "aeiou";

//        for(int i = 0; i < s.length(); i++){
//            // both of these give back one character
//            System.out.println(s.charAt(i));  // this is a char datatype
//            System.out.println(s.substring(i, i+1)); // this is a String datatype
//
//        }

        for(int i = 0; i < s.length(); i++){

            if(vowels.contains(s.substring(i, i+1))){ // "" +s.charAt(i)
                count++;
            }

        }

        System.out.println(count);

        /*

        if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' etc


         */


    }
}
