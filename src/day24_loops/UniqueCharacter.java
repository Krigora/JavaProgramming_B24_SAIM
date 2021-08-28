package day24_loops;

import java.util.Scanner;

public class UniqueCharacter {

    public static void main(String[] args) {

        /*

            ask for a word
            ask for a letter
                next().chatAt(0)

            is the letter unique in the word

                java
                j
                -> unique

                java
                a
                -> not unique

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next().toLowerCase();

        System.out.println("Enter a letter");
        char letter = input.next().toLowerCase().charAt(0);
        /*
            String s = input.next();
            s = s.toLowerCase();
            char l = s.charAt(0);
         */

        int count = 0;

        for(int i = 0; i < word.length(); i++) {  // i <= word.length() - 1
            if(word.charAt(i) == letter){
                count++;
            }
        }

        if(count == 1){
            System.out.println(letter + " is unique");
        } else if(count == 0){
            System.out.println(letter + " was not in the String");
        } else {
            System.out.println(letter + " is NOT unique");
        }

    }
}
