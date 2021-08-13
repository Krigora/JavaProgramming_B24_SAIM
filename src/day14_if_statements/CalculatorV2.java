package day14_if_statements;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {

        /*
        ask the user to enter 2 number

        operator - String
        @

        / -> 2nd num = 0
                                come back at 8:15 est
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one:");
        double numberOne = input.nextDouble();

        System.out.println("Enter the operator\n\t+ - * / %");
        String operator = input.next();

        System.out.println("Enter number two:");
        double numberTwo = input.nextDouble();

        boolean isValidOperator = operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%");

        double result = 0;

        if(isValidOperator){

            if(operator.equals("+")){
                result = numberOne + numberTwo;
            } else if(operator.equals("-")){
                result = numberOne - numberTwo;
            } else if(operator.equals("*")){
                result = numberOne * numberTwo;
            } else if(operator.equals("/")){
                result = numberOne / numberTwo;
            } else if(operator.equals("%")){
                result = numberOne % numberTwo;
            }

        } else {
            System.out.println(operator + " is not a valid operator");
        }

        System.out.println(numberOne + " " + operator + " " + numberTwo + " = " + result);

    }
}
