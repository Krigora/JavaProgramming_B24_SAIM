package day24_loops;

public class CountLetter {

    public static void main(String[] args) {

        String str = "abbaba";

        int count = 0;

        for(int i = 0; i < str.length(); i++) { // i <= str.length() - 1 ;

           if(str.charAt(i) == 'a'){
               count++;
           }

        }

        System.out.println("a was found " + count + " times");



//        String str = "abbaba";
//        int count = 0;
//
//        if(str.charAt(0) == 'a'){
//            count++;
//        }
//
//        if(str.charAt(1) == 'a'){
//            count++;
//        }
//
//        if(str.charAt(2) == 'a'){
//            count++;
//        }
//
//        if(str.charAt(3) == 'a'){
//            count++;
//        }
//
//        if(str.charAt(4) == 'a'){
//            count++;
//        }
//
//        if(str.charAt(5) == 'a'){
//            count++;
//        }
//
//        if(str.charAt(6) == 'a'){
//            count++;
//        }
//

    }
}
