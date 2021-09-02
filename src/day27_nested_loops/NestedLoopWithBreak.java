package day27_nested_loops;

public class NestedLoopWithBreak {
    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++){  // this is the outer loop

//            if(i == 2){   this breaks the outer loop, so it only has one iteration
//                break;      //that means we only see first, second, second
//            }

            System.out.println("first");


            for (int j = 1; j <= 2; j++){ // this is the inner loop

//                if(j == 2){    this breaks the inner loop, so only one iteration of the inner loop is run
//                    break;
//                }

                System.out.println("second");

            }


        }


    }
}
