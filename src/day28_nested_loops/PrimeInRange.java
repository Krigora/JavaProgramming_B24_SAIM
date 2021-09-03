package day28_nested_loops;

import java.util.Scanner;

public class PrimeInRange {

    public static void main(String[] args) {

        // goes from 2 -> any number

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your range");
        int range = input.nextInt();

        for(int number = 2; number <= range; number++){

            boolean isPrime = true;

            for(int j = 2; j < number; j++){

                if(number % j == 0){
                    isPrime = false;
                    break;
                }

            }

            if(isPrime){
                System.out.print(number + " ");
            }

        }


        /*

            2
                2 % 2
            3
                3 % 2
            4
                4 % 2
                4 % 3
            5
                5 % 2
                5 % 3
                5 % 4



         */

    }
}
