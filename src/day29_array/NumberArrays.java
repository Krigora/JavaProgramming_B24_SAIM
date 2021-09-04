package day29_array;

import java.util.Arrays;

public class NumberArrays {
    public static void main(String[] args) {

        int [] ages = { 10, 14, 21, 80, 50, 70, 30, 40, 10};

        System.out.println(ages.length);
        System.out.println(Arrays.toString(ages));

        // The below lines are the same thing
        System.out.println(ages[7]);
        System.out.println(ages[ages.length - 2]);

        double [] scores = {90.3, 80.13, 40.50, 19.9, 100.0, 50};
        System.out.println(scores.length);
        System.out.println(Arrays.toString(scores));

        System.out.println(scores[0] + scores[1]);


    }
}
