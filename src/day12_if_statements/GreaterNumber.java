package day12_if_statements;

public class GreaterNumber {

    /*

    Write Java program that will have three numbers and print the greatest number.

        First number: 4
        Second number: 8
        Third number: 1

        Output:
        The greatest number from 4, 8, 1 is:  8
         */

    public static void main(String[] args) {

        int first = 20;
        int second = 30;
        int third = 30;

        int biggest = 0;

        if(first >= second && first >= third && true){
            biggest = first;
        }

        if(second >= first && second >= third){
            biggest = second;
        }

        if(third >= first && third >= second){
            biggest = third;
        }

        System.out.println("Our biggest number is: " + biggest);

    }
}
