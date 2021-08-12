package day14_if_statements;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {

        /*
        ask the user to enter 2 number

        operator - String
        @

        / -> 2nd num = 0

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one:");
        double numberOne = input.nextDouble();

        System.out.println("Enter the operator\n\t+ - * / %");
        String operator = input.next();

        System.out.println("Enter number two:");
        double numberTwo = input.nextDouble();

        boolean isValidOperator = operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%");

        if(isValidOperator){

            // TODO: do calculation



        } else {
            System.out.println(operator + " is not a valid operator");
        }



    }
}
