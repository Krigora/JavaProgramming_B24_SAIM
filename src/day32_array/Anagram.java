package day32_array;

import java.util.Arrays;

public class Anagram {

    /*

    What is anagram
        2 words are anagram if they are built up of the same character

        abc
        bca

     */

    public static void main(String[] args) {

        String one = "listen";
        String two = "silent";

        // convert Strings to char arrays, to be able to compare each character

        char [] oneArr = one.toCharArray();
        char [] twoArr = two.toCharArray();

        // sort the characters in order

        Arrays.sort(oneArr);
        Arrays.sort(twoArr);

        System.out.println("Is anagram " + Arrays.equals(oneArr, twoArr));


    }



}
