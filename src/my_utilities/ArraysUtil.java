package my_utilities;

public class ArraysUtil {

    /*
        This method will accept an int array and return the min number from the array
     */

    public static int minNumber(int [] arr){

        int min = arr[0];

        for(int each : arr){
            if(each < min){
                min = each;
            }
        }

        return min;
    }

    public static int maxNumber(int [] arr){

        int max = arr[0];

        for(int each : arr){
            if(each > max){
                max = each;
            }
        }

        return max;
    }

}
