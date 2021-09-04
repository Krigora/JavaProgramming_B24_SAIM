package day29_array;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] prices = new double[5];
        System.out.println(Arrays.toString(prices));

        prices[0] = 25.99;
        System.out.println(Arrays.toString(prices));

        prices[1] = 30.5;
        prices[2] = 50.2;
        prices[3] = 90.5;
        prices[4] = 100.5;
        System.out.println(Arrays.toString(prices));


    }
}
