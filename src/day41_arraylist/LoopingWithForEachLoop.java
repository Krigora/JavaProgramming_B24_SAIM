package day41_arraylist;

import java.util.ArrayList;

public class LoopingWithForEachLoop {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(21);
        nums.add(53);
        nums.add(90);

        for(int each : nums){
            if(each % 2 == 1){
                System.out.println(each);
            }
        }

//        if(nums.get(0) % 2 == 1){
//            System.out.println(nums.get(0));
//        }
//        if(nums.get(1) % 2 == 1){
//            System.out.println(nums.get(1));
//        }
//        if(nums.get(2) % 2 == 1){
//            System.out.println(nums.get(2));
//        }
//        if(nums.get(3) % 2 == 1){
//            System.out.println(nums.get(3));
//        }

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) % 2 == 1){
                System.out.println(nums.get(i));
            }
        }


    }
}
