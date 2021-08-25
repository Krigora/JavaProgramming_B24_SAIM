package day22_loops;

import java.util.Scanner;

public class MinAndMax {

    /*
    write a program that asks user to enter 5 numbers and returns the minimum and maximum numbers
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int max = -2147483648;
        int min = 2147483647;

        while(counter <= 5){
            counter++;

            System.out.println("Enter a number:");
            int number = input.nextInt();

        }


    }
}
