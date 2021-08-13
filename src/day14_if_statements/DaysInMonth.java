package day14_if_statements;

import java.util.Scanner;

public class DaysInMonth {
    /*
        create a class DaysInMonth
        create a main method

        Write a program that can find the number of days in a month (Assume that Feb has 28 days) The month can be represented by a number

            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12

        Challenge: Recreate the program to work with String inputs of the month names

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your month number");
        int month = input.nextInt();

        if(month >= 1 && month <= 12){
            // valid month

            if(month == 2){
                System.out.println("28 days");
            } else if(month == 4 || month == 6 || month == 9 || month == 11){
                System.out.println("30 days");
            } else {
                System.out.println("31 days");
            }

        } else {
            System.out.println("Invalid month number. Can only be from 1-12");
        }

    }

}
