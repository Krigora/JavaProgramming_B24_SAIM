package day29_array;

import java.util.Scanner;

public class PickMonth {

    /*
        Ask the user to enter a month number
        Print which month they select
        1 -> January
        ..
        12 -> december
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] months = {
               "Jan", "Feb", "Mar", "Apr" , "May", "Jun", "Jul",
                "Aug", "Sep", "Oct", "Nov", "Dec" };

        System.out.println("Enter a month number: ");
        int num = input.nextInt();

        System.out.println("The month you picked is: " +  months[num - 1] ); // allows us to go from a number to an index

    }
}
