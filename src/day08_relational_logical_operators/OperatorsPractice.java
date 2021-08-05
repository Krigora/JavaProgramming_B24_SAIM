package day08_relational_logical_operators;

public class OperatorsPractice {

    public static void main(String[] args) {
        /*
            * / %
            + -
         */

        int w = 78 / 2 * 2 + 3 - 5 % 5;
        //      39 * 2 + 3 - 5 % 5
        //      78 + 3 - 5 % 5   -> 5/5 = 1 , but no remain
        //      78 + 3 - 0
        //      81
        System.out.println("w: " + w);

        // 12 pizza 5 people. 12/5 = 2 -> 5 + 5  = 10 (given) + 2 (left over)

        System.out.println();

        int a = 8; // 7
        int b = a--; // b = 8

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println();

        int c = 1; // c = -1
        int d = -c-- + c++ / -c-- * --c;
        //      -1  + 0   /  -1   *  -1
        //      -1  + 0   *  -1
        //      -1  + 0
        // int d =     -1

        System.out.println("c: " + c);
        System.out.println("d: " + d);



    }
}
