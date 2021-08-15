package day16_switch;

import java.util.Scanner;

public class DaysInMonth {
    /*
    add new class DaysInMonth (redo)
    add a main method

    Write a program that will accept a month name and output how many days are in that month

        February: 28 days
        April, June, September, November: 30 days
        January, March, May, July, August, October, December: 31 days

        If statement code:

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

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month");

        // String month = input.next();

        int days = 0;

        switch (input.next()) {  // switch(month)
            case "February":
                days = 28;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                days = 30;
                break;
            case "January": case "March": case "May": case "July": case "August": case "October": case "December":
                days = 31;
                break;
            default:
                System.out.println("Invalid month entered");
        }

        if(days != 0){
            System.out.println(days + " days");
        }



/*
        February: 28 days
        April, June, September, November: 30 days
        January, March, May, July, August, October, December: 31 days

 */


    }


}
