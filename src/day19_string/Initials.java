package day19_string;

import java.util.Scanner;

public class Initials {

    /*

       Ask the user to enter their first name
       Ask the user to enter their last name
       Then print the initials
                James Bond-> JB

           Bonus: give the initials as uppercase

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();

        String initials = "" + firstName.charAt(0) + lastName.charAt(0);

        System.out.println(initials.toUpperCase());
//come back at 12: 17 est

    }

}
