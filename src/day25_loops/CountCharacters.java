package day25_loops;

import java.util.Scanner;

public class CountCharacters {

    /*
    Count upper, lower, and numbers
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
        Ex:
        Input: 2juMp41EEkd4s4 Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int upper = 0;
        int lower = 0;
        int number = 0;

        System.out.println("Please enter a String");
        String str = input.next();

        for(int i = 0; i < str.length(); i++){

            char eachChar = str.charAt(i);

            if(eachChar >= 'A' && eachChar <= 'Z'){
                upper++;
            } else if(eachChar >= 'a' && eachChar <= 'z'){
                lower++;
            } else if(eachChar >= '0' && eachChar <= '9'){
                number++;
            }

        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Number:  " + number);




    }

}
