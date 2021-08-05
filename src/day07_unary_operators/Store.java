package day07_unary_operators;

public class Store {

    public static void main(String[] args) {

        String storeName = "Target";
        int numberOfTvs = 100;

        System.out.println("Person came into the store and bought a tv");
        System.out.println("Number of tvs now: " + --numberOfTvs );

        System.out.println("Person came into the store and bought a tv");
        System.out.println("Number of tvs now: " + --numberOfTvs );

        System.out.println("Person came into the store and put a tv into the cart");
        System.out.println("Number of tvs in the store is still: " + numberOfTvs--);
        System.out.println("They buy everything and leave " + numberOfTvs);

        System.out.println("Shipment of tvs comes");
//        numberOfTvs++;
//        numberOfTvs++;
//        numberOfTvs++;
            // 47 more lines

        numberOfTvs = numberOfTvs + 53; // reassigned

        System.out.println("someone with big bucks comes in and buys 5 tvs");
        numberOfTvs = numberOfTvs - 5;


       // numberOfTvs++ <- same -> numberOfTvs = numberOfTvs + 1;

    }
}
