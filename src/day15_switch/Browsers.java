package day15_switch;

import java.util.Scanner;

public class Browsers {

    public static void main(String[] args) {

        /*

        Browsers
            chrome
            firefox
            safari
            ie
            edge

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Which browser do you want to use");
        String browser = input.next();
        System.out.println("Enter the url:");
        String url = input.next();

        switch (browser){
            case "Chrome":
            case "CRHOME":
            case "chrome":
                System.out.println("Opening " + url + " in chrome");
                break;
            case "firefox":
                System.out.println("Opening " + url + " in firefox");
                break;
            case "safari":
                System.out.println("Your mac opening safari");
                System.out.println("Going to " + url);
                break;
            case "ie":
                System.out.println("IE is not longer supported");
                break;
            case "edge":
                System.out.println("Edge is opening " + url);
                break;
            default:
                System.out.println("Invalid browser");
        }

    }
}
