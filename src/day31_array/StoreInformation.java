package day31_array;

public class StoreInformation {
    public static void main(String[] args) {

        String [] items = { "Shoes", "Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 9.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };

        // Find out if the store has jackets

        boolean hasJackets = false;

        for(String eachItem : items){
            if(eachItem.equals("Jackets")){
                hasJackets = true;
                break;
            }
        }

        if(hasJackets){
            System.out.println("Yes we have jackets, Do you want some?");
        } else {
            System.out.println("No sorry, we don't have jackets");
        }

        //

    }
}
