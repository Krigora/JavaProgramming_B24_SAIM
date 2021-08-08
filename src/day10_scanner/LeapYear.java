package day10_scanner;

// import day04_variables.Store; example to import Store from day 4 package

import java.util.Scanner;

public class LeapYear {

/*

create a class LeapYear
create a main method
create a Scanner object

Ask the user to enter a year. Determine if the year is a leap year or not. You can assume a leap year is a year that is divisible by 4. Print true or false.

Hint: use remainder operator
 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year");

        int year = input.nextInt();

        boolean isLeapYear = year % 4 == 0; // 2000, 2004, 2008

        System.out.println("Is leap year: " + isLeapYear);

        // come back at 11: 18 est

    }
}
