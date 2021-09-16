package my_utilities;

public class StringUtil {

    /*
        Reverse method

        It will accept the String parameter and return the reverse version of the String
     */

    public static String reverse(String original){

        String reverse = "";

        for(int i = original.length() - 1; i >= 0; i--){
            reverse += original.charAt(i);
        }

        return reverse;
    }

}
