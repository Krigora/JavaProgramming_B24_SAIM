package day08_relational_logical_operators;

public class GiftCard {

    /*

add new class GiftCard
add main method

	gift card balance = 200
	item 1 price = 40
	item 2 price = 100

	calculate the remaining balance of gift card

Example output:

	The gift card started with a balance of $200 and after buying item 1 for $40 and item 2 for $100. The remaining balance of the gift card is $60.

     */

    public static void main(String[] args) {

        double balance = 200;
        System.out.println("Gift card balance: " + balance);
        System.out.println("buy item 1 and is cost $40");

        balance -= 40;
        System.out.println("Gift card balance: " + balance);
        System.out.println("buy item 2 and it cost $100");

        balance -= 100;
        System.out.println("Gift card balance: " + balance);
    }


}
