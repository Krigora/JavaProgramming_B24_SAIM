package day37_methods;

public class NumberReturnMethods {

    /*
    Task:

	Create a method that will accept a number parameter. We want to return a number as a word in String format

		range: 1-10

		method(1) -> one
		method(10) -> ten
		method(11)-> out of range

		return type: String
		method name: convertNumberToWord
		parameter: int
     */

    public static void main(String[] args) {
        System.out.println(convertNumberToWord(5));
        System.out.println(convertNumberToWord(-1));
        System.out.println(convertNumberToWord(7));
    }

    public static String convertNumberToWord(int num){

        if(num <= 0 || num > 10){
            return "Out of Range";
        }

        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        return words[num - 1];

    }



}
