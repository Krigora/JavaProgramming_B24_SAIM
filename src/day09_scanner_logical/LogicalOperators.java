package day09_scanner_logical;

public class LogicalOperators {

    public static void main(String[] args) {

        /*
        	Math Ex:
		        3 < i < 40
         */

        int i = 5;

        boolean output =  i > 3 && i < 40; // true && true
        System.out.println(output);

        boolean output2 = i < 3 || i > 40; // false || false
        System.out.println(output2);

        int min = 3;
        int max = 40;

        System.out.println(i > min && i < max);
        System.out.println(i < min || i > max);

        System.out.println(true || false && true); // true || false

        System.out.println((true || false) && true); // true && true


    }
}
