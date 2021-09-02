package day27_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){

            System.out.println("---- Table for " + i + " ----");

            for(int j = 1; j <= 10; j++){

                System.out.println(i + " x " + j + " = " + (i * j));

            }


        }

        // manual way with copy paste and changing the number

//        for(int j = 1; j <= 10; j++){
//
//            System.out.println(1 + " x " + j + " = " + (1 * j));
//
//        }
//
//        for(int j = 1; j <= 10; j++){
//
//            System.out.println(2 + " x " + j + " = " + (2 * j));
//
//        }
//        for(int j = 1; j <= 10; j++){
//
//            System.out.println(3 + " x " + j + " = " + (3 * j));
//
//        }


    }
}
