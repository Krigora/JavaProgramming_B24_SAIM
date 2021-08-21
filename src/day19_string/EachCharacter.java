package day19_string;

public class EachCharacter {
    public static void main(String[] args) {

        String java = "javaa";
        //             01234

        // charAt(number) gives a char based on the number you give

        System.out.print(java.charAt(0));
        System.out.print(java.charAt(1));
        System.out.print(java.charAt(2));
        System.out.println(java.charAt(3));

        //System.out.println(java.charAt(100));
        //  If you use an index number that does not exist in your String it will go out of bounds

        char firstLetter = java.charAt(0);

        System.out.println(java.charAt(0) + java.charAt(1) + java.charAt(2) + java.charAt(3));
        // Above will add the ascii values of the char and print it. char + char

        System.out.println("" + java.charAt(0) + java.charAt(1) + java.charAt(2) + java.charAt(3));
        // by adding the empty space we can do concatenation and get the character values, not addition. String + char


    }
}
