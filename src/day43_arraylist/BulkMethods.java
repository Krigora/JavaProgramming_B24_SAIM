package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);

        nums.addAll( Arrays.asList(3, 5, 1, 2, 5) );

        ArrayList<Integer> other = new ArrayList( Arrays.asList( 10, 20));

//        nums.add( other.get(0) );
//        nums.add( other.get(1) );

        // 5, 3, 5, 1, 2, 5
        // other: 10, 20
        // 10, 20, 5, 3, 5, 1, 2, 5

        nums.addAll(0, other); // puts all the values of the other ArrayList starting from index 0


        System.out.println(nums);
        System.out.println(other);

        // These 2 lines only removes the first 5
//        Integer five = 5;
//        nums.remove(five);

        nums.removeAll( Arrays.asList(5, 10) );

        System.out.println(nums);

    }
}
