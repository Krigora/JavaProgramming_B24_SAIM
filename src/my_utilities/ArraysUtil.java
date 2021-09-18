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

    public static boolean contains(int [] arr, int num){

        for(int each : arr){
            if(each == num){
                return true;
            }
        }

        return false;
    }

    public static int sumOfElements(int [] arr){

        int sum = 0;

        for(int num : arr){
            sum += num;
        }

        return sum;
    }

    public static int [] addElement(int [] arr, int element){

        int [] newArr = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        newArr[newArr.length - 1] = element;

        return newArr;
    }

}
