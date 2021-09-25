package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Recap {

    public static void main(String[] args) {

        /*
            The first ArrayList is made to be empty
            then we added 3 elements using the add method 3 times
         */

        ArrayList<String> first = new ArrayList<>();
        first.add("water");
        first.add("items");
        first.add("run");

        // The second ArrayList object was made while copying the elements from the first ArrayList

        ArrayList<String> second = new ArrayList<>( first ); // able to make ArrayList object by giving a collection type in the parenthesis
        second.add("pen");

        System.out.println(first);
        System.out.println(second);

        ArrayList<String> third = new ArrayList<>( Arrays.asList("one", "two") );

        System.out.println(third);


    }

}
