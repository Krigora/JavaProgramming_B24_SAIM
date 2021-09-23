package day42_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {

    /*

        ArrayList of caffeinated drinks

        Figure out how much caffeine each drink has, and store that into a new ArrayList

        coffee - 80
        tea - 50
        monster - 100
        red bull - 100
        coke - 70
        pepsi - 70
        bang - 100
        apple juice - 0

     */

    public static void main(String[] args) {

        String [] allDrinks = {"coffee", "tea", "monster", "red bull", "coke", "pepsi", "bang", "apple juice"};

        ArrayList<String> drinkList = new ArrayList<>( Arrays.asList(allDrinks) );

        ArrayList<Integer> caffeineAmounts = new ArrayList<>();

        for(String eachDrink : drinkList){

            int caffeineNum = 0;

            switch (eachDrink){
                case "apple juice":
                    caffeineNum = 0;
                    break;
                case "tea":
                    caffeineNum = 50;
                    break;
                case "coke":
                case "pepsi":
                    caffeineNum = 70;
                    break;
                case "coffee":
                    caffeineNum = 80;
                    break;
                case "monster":
                case "red bull":
                case "bang":
                    caffeineNum = 100;
                    break;
            }

            caffeineAmounts.add(caffeineNum);

        }

        System.out.println(drinkList);
        System.out.println(caffeineAmounts);

    }



}
