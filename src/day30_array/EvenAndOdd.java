package day30_array;

import java.util.Arrays;

public class EvenAndOdd {

    /*

        declare an int array
        count how many even number there is
        count how many odd numbers there is

        print your counters

        challenges:
            traditional for loop
            for each loop

            - not hard code in initial array, but use scanner to get the numbers

     */

    public static void main(String[] args) {

        int [] numbers = {9, 24, 5, 1, 5, 29, 52};
        int even = 0;
        int odd = 0;

        String evenNumbers = "";
        String oddNumbers = "";

        for(int eachNum : numbers){

            if(eachNum % 2 == 0){
                even++;
                evenNumbers += eachNum + " ";
            } else {
                odd++;
                oddNumbers += eachNum + " ";
            }

        }

//        for(int i = 0; i < numbers.length; i++){
//
//            if(numbers[i] % 2 == 0){
//                even++;
//                evenNumbers += numbers[i] + " ";
//            } else {
//                odd++;
//                oddNumbers += numbers[i] + " ";
//            }
//
//        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Even: " + even);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd: " + odd);
        System.out.println("odd numbers: " + oddNumbers);


    }
}
