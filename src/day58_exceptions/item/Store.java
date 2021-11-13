package day58_exceptions.item;

import sun.util.calendar.Era;

public class Store {

    public static void main(String[] args) {

        Eragon obj1 = new Eragon(); // itself

        Book obj2 = new Eragon(); // parent

        Item obj3 = new Eragon(); // parent

        // also have interface for reference

        obj1.use();
        obj2.use();
        obj3.use();

        // new Book("").use();

        obj1.sell();
        ((Eragon)obj2).sell();
        Eragon newObj = (Eragon)obj3;
        newObj.sell();

        purchase(new Item("wooden spoon"));
        purchase(obj1);
        purchase(new Book("Harry Potter"));

    }

    public static void purchase(Item item){
        System.out.println("Purchasing " + item.name);
    }


}


/*

    long l = 100l;
    byte b = (byte)l;


 */