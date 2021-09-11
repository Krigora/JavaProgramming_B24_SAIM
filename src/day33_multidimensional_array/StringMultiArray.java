package day33_multidimensional_array;

import java.util.Arrays;

public class StringMultiArray {

    public static void main(String[] args) {

        String [][] cybertek = new String[4][];

        String [] groupOne = {"Sergii", "Nisso", "Rano"};
        String [] groupTwo = {"Mubarek", "Ibrahim"};
        String [] groupThree = {"Nadir", "Saim"};
        String [] groupFour= {"Nicole", "Tach", "Ailya", "Mohammed"};


        System.out.println(cybertek.length);
        System.out.println(Arrays.deepToString(cybertek));


    }
}
