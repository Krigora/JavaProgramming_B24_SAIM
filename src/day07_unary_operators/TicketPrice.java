package day07_unary_operators;

public class TicketPrice {

    /*
    add new class TicketPrice
add main method

From Chicago to Virginia
	city 1 -> Chicago
	city 2 -> Virginia
	base ticket price -> 110.50
	miles between cities -> 739.8
		add to the ticket price by dividing miles by 10

Example output:
	The ticket price from Chicago to Virginia is $184.48

     */

    public static void main(String[] args) {

        String cityOne = "Chicago";
        String cityTwo = "Virginia";
        double baseTicketPrice = 110.50;
        double milesBetweenCities = 739.8;
        double totalPriceAfterMiles = baseTicketPrice + milesBetweenCities / 10;

        System.out.println("The ticket price from " + cityOne + " to " + cityTwo
                + " is $" + totalPriceAfterMiles);

        float f = 40.5f;
        long l = 10;

        float result = f * l;
        long result2 = (long)( f * l); // long result2 = (long) result;

    }
}
