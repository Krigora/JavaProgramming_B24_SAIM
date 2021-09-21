package day40_arraylist;

import java.util.ArrayList;

public class Classroom {

    public static void main(String[] args) {

        ArrayList<String> groupOne = new ArrayList<>();
        System.out.println(groupOne);
        System.out.println(groupOne.size()); // how many elements is there

        groupOne.add("Vindar");
        groupOne.add("James Bond");
        groupOne.add("Tach");
        groupOne.add("Topcu");
        System.out.println(groupOne);

        System.out.println("First element: " + groupOne.get(0));
        System.out.println("Second element: " + groupOne.get(1));
        System.out.println("Third element: " + groupOne.get(2));
        System.out.println("Fourth element: " + groupOne.get(3));

        System.out.println("First element, first char: " + groupOne.get(0).charAt(0));

        ArrayList<String> groupTwo = new ArrayList<>(20);
        System.out.println(groupTwo.size());


    }
}
