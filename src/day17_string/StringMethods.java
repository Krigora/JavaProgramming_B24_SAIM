package day17_string;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";

        System.out.println(name.equals("james")); // true

        System.out.println(name.equals("James")); // false

        System.out.println(name.equalsIgnoreCase("James")); // true

        System.out.println(name.equalsIgnoreCase("JaMeS")); // true

        System.out.println(name.toUpperCase()); // JAMES

        System.out.println(name);

        String lastName = "bond";
        lastName = lastName.toUpperCase();
        System.out.println(lastName); // BOND

        System.out.println(lastName.toLowerCase()); // bond

        System.out.println(lastName); // BOND

        String word = "Monday";
        int length = word.length();
        System.out.println(length); // 6

        String word2 = "Monday ";  // space is also a character
        int length2 = word2.length();
        System.out.println(length2); // 7

    }
}
