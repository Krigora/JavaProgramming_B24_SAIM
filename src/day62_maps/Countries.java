package day62_maps;

import day53_inheritance.rules.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Countries {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> countries = new HashMap<>();
        // key is a String - each continent
        // value is an ArrayList of String - each holds all the cities in that continent

        countries.put("North America", new ArrayList<>(Arrays.asList("Chicago", "New York", "Dallas", "Arlington")));
        countries.put("Europe", new ArrayList<>(Arrays.asList("Paris", "Rome", "Berlin", "Sivas")));
        countries.put("Asia", new ArrayList<>(Arrays.asList("Bangkok", "Tokyo", "Seoul")));

        System.out.println(countries);

        for(String continent : countries.keySet()){
            System.out.println("Cities in " + continent + " are " + countries.get(continent));
        }

        System.out.println();
        // print first letter of each city

        for(String continent : countries.keySet()){  // first loop goes through the keys which are continents
            System.out.println("Cities in " + continent);

            for(String city : countries.get(continent)){  // second loop goes through the cities which are each ArrayList value
                System.out.println(city.substring(0,1));
            }

        }


    }
}
