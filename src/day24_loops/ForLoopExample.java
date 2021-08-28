package day24_loops;

public class ForLoopExample {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

       // System.out.println(i); i is not visible outside of the loop

        /*
             Flow of for loop:

            - it executes the initialization part to declare the variable:
                 int i = 1;

                   -> once in the beginning of the loop

            - checks the boolean / termination condition part
                i <= 10;

                if the boolean is true: the loop will run
                if the boolean is false: the loop stops

             - next the loop body, statements inside of the loop

                System.out.println(i);

             - next the update part is run
                i++

             - repeat the steps by checking the boolean/ termination condition part
                i <= 10;

         */



    }
}
