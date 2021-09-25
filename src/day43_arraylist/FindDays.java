package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDays {

    /*

        Create a method that will return an ArrayList with all the days
           Monday, Tuesday, ... Sunday

          Overload the method so it accept the int number - which day of the week they want
          String

          Input: 1
          Output: Monday

     */
    public static void main(String[] args) {
        System.out.println(getDays());

        System.out.println(getDays(1));

        System.out.println(getDays(7));

        ArrayList<String> days = getDays();
        System.out.println( days.containsAll( Arrays.asList("Monday", "Friday", "Sunday")) );

        /*
            if you wanted to this this same checking for 1 element at a time:
            days.contains("Monday") && days.contains("Friday") && days.contains("Sunday")
         */

        System.out.println( days.containsAll( Arrays.asList("Monday", "April", "Sunday")) );
    }

    public static ArrayList<String> getDays(){

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));

        return daysInList;

    }


    public static String getDays(int day){
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));

        return daysInList.get(day - 1);
    }



}
