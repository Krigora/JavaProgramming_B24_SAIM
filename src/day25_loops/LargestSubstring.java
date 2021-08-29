package day25_loops;

public class LargestSubstring {

    /*
    Given a String find the biggest substring of chars that match and print it.
        Ex: aaabbbcccccddddee
        Output: ccccc
     */

    public static void main(String[] args) {

        String str = "aaabbbcccccddddee";
        String other = ""; //  ee
        String longSub = ""; // ccccc

        for(int i = 0; i < str.length() - 1; i++){

            other += str.charAt(i);

            if(str.charAt(i) != str.charAt(i + 1)){ // action is done here, when the char is not same as the char next to it

                if(other.length() > longSub.length()){
                    longSub = other;
                }

                other = "";

            }

        }

        System.out.println(longSub);

    }
}
