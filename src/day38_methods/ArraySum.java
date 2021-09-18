package day38_methods;

public class ArraySum {

    /*
         Create a method that will take an array and return the sum of all the elements

     */

    public static void main(String[] args) {

        int [] arr = {3, 5, 1, 5};

        System.out.println(sumOfElements(arr));

    }

    public static int sumOfElements(int [] arr){

        int sum = 0;

        for(int num : arr){
            sum += num;
        }

        return sum;
    }

}
