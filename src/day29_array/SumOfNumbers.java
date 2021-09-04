package day29_array;

public class SumOfNumbers {
    public static void main(String[] args) {

        int [] numbers = {4, 1, 4};

        int sum = 0;

        sum += numbers[0];  // sum = sum + number[0]
        sum += numbers[1];
        sum += numbers[2];

        System.out.println(sum);

    }
}
