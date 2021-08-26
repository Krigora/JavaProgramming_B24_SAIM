package day23_loops;

import java.util.Scanner;

public class AtmPin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int validPin = 1234;
        int userPin;

        do{

            System.out.println("Enter your pin");
            userPin = input.nextInt();

        }while (userPin != validPin);

        System.out.println("Welcome, you are logged in");


    }
}
