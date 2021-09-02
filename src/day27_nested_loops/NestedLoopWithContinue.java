package day27_nested_loops;

public class NestedLoopWithContinue {
    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++){  // this is the outer loop


            System.out.println("first" + "i: " + i);

            for (int j = 1; j <= 3; j++){ // this is the inner loop

                if(j == 2){
                    continue;
                }

                System.out.println("second " + "i:" + i + " j:" + j);

            }


        }
    }
}
