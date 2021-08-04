package day07_unary_operators;

public class Pizza {

    /*
    add new class Pizza
add main method

	pizza = "cheese"
	pizza slices = 8
	people = 4
	calculate the slices per person

    Example output:

	We ordered cheese pizza with 8 slices, 4 people ate 2 slices each
     */

    public static void main(String[] args) {

        String type = "cheese";
        int pizzaSlices = 8;
        int people = 4;
        int slicesPerPerson = pizzaSlices / people;

        //byte slicesPerPerson = (byte)(pizzaSlices / people);

        System.out.println("We ordered " + type + " pizza with " + pizzaSlices
                + " slices, " + people + " people ate " +slicesPerPerson + " slices each" );

    }
}
