package day05_variables;

public class CellPhone {

    /*
      ------------------------------------------------------------
        Task

        Add new a class CellPhone
        Add main method

        Create and assign there variables
            brand, model, color, price, storage(gb), hasCamera

        Print all the variables
        ------------------------------------------------------------
     */

    public static void main(String[] args) {
        // Come back 3:15 est
        String brand = "Samsung";
        String model = "Note 10+";
        String color = "Black";
        double price = 1099.99;
        int storage = 256;
        boolean hasCamera = true;

        color = "Silver"; // reassigned

        System.out.println("Information for the " + model);
        System.out.println(model + " is a " + brand + " phone");
        System.out.println("This phone comes in " + color + " and has " + storage + "GB of memory");
        System.out.println("Has a camera: " + hasCamera);
        System.out.println("All of this for $" + price);

        System.out.println(brand + " " + model); // put space between variables

        System.out.println();

        // approach two:

        String info = "\t\t\tInformation for the " + model + "\n\t" + model + " is a " + brand + " phone" + "\n\tThis phone comes in " + color + " and has " + storage + "GB of memory\n\t" + "Has a camera: " + hasCamera + "\n\tAll of this for $" + price;

        System.out.println(info);

    }


}
