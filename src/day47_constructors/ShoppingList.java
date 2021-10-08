package day47_constructors;

public class ShoppingList {

    public static void main(String[] args) {

        Item firstItem = new Item("Apples", 5, 1.33);
        firstItem.quantity += 5;
        firstItem.calculatePrice();
        System.out.println(firstItem);


    }


}
