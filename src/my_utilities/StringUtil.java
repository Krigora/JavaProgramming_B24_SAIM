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

    /*

        Method will accept the String and return a String in proper format

        First character as uppercase and the rest as lowercase

     */

    public static String fixCaseFormat(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }


}
