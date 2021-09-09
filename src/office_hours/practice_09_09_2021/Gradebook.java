package office_hours.practice_09_09_2021;

import java.util.Arrays;
import java.util.Scanner;

public class Gradebook {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Figure out how many students and score we will enter

        System.out.println("How many students will you enter");
        int size = input.nextInt();

        // make student array and score array

        String [] students = new String[size];
        double [] scores = new double[size];
        char [] grades = new char[size];

        // ask the user to enter the student and scores. Fill up array
        // make another array for the letter grade and calculate for each one

        for(int i = 0; i < size; i++) { // students.length or scores.length or size

            input.nextLine();

            System.out.println("Please enter student " + (i + 1));
            students[i] = input.nextLine();

            System.out.println("Please enter " + students[i] + "'s score");
            scores[i] = input.nextDouble();

            if(scores[i] >= 90){
                grades[i] = 'A';
            } else if (scores[i] >= 80){
                grades[i] = 'B';
            } else if(scores[i] >= 70){
                grades[i] = 'C';
            } else if(scores[i] >= 60){
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }

        }

        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(grades));



    }


}
