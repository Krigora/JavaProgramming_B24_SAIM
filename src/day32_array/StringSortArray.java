package day32_array;

import java.util.Arrays;

public class StringSortArray {
    public static void main(String[] args) {

        String [] strs = {"4java", "8eight", "Hello", "hello", "HEllo", "$Dollar", "words5", "$apple", "double$", " space"};

        Arrays.sort(strs);

        System.out.println(Arrays.toString(strs));

    }
}
