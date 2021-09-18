package day38_methods;

public class IndexOfMethod {

    /*

        Create a method that will accept an array and an element
        return the index of the first occurrence of the element

        if the element does not exist in our array, we will return -1

        start with int array

        after: overload to work with String array

     */

    public static int indexOf(int [] nums, int element){

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == element){
                return i;
            }
        }

        return -1;
    }



}
