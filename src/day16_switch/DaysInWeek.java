package day16_switch;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day number from 1-7");
        int day = input.nextInt();

        String dayInWords = "";

        switch (day){

            case 1: dayInWords = "Monday"; break;
            case 2: dayInWords = "Tuesday"; break;
            case 3: dayInWords = "Wednesday"; break;
            case 4: dayInWords = "Thursday"; break;
            case 5: dayInWords = "Friday"; break;
            case 6: dayInWords = "Saturday"; break;
            case 7: dayInWords = "Sunday"; break;
            default: dayInWords = "Invalid day number. Needs to be between 1-7";

        }

        System.out.println(day);
        System.out.println(dayInWords);

    }


}


/*

add new class DaysInWeek (redo)
add a main method

Write a program that will display the given day based on a number input.
Start with 1 for Monday up to 7 for Sunday. Handle the invalid day numbers

    Ex:
        input: 2
        output: Tuesday

        String result = "";

        if(day == 1){
            result = "Monday";
        } else if(day == 2) {
            result = "Tuesday";
        } else if(day == 3){
            result = "Wednesday";
        } else if(day == 4){
            result = "Thursday";
        } else if(day == 5){
            result = "Friday";
        } else if(day == 6){
            result = "Saturday";
        } else if(day == 7){
            result = "Sunday";
        } else {
            result = "Invalid day number";
        }

        System.out.println(result);
 */