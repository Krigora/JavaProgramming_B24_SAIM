package day45_constructors;

public class Item {

    String name;
    double price;

    @Override  // dont worry about it
    public String toString() {
        return "Item{" +
                "name: '" + name + '\'' +
                ", price: " + price +
                '}';
    }
}
