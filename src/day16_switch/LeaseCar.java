package day16_switch;

import java.util.Scanner;

public class LeaseCar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Which car Make do you want");
        String carMake = input.nextLine();

        System.out.println("Which " + carMake + " model do you want");
        String carModel = input.nextLine();

        double leasePrice = 0;

        switch (carMake) {

            case "Lexus":
                // rx350, lc500, ct200h
                if (carModel.equals("RX350")) {
                    leasePrice = 600;
                } else if (carModel.equals("LC500")) {
                    leasePrice = 900;
                } else if (carModel.equals("CT200H")) {
                    leasePrice = 350;
                } else {
                    System.out.println("We don't have " + carModel);
                }
                break;

            case "Cadillac":
                if(carModel.equals("Escalade")){
                    leasePrice = 2000;
                } else if (carModel.equals("ATS")){
                    leasePrice = 1500;
                } else {
                    System.out.println("We don't have " + carModel);
                }
                break;

            default:
                System.out.println("We don't have " + carMake);
        }

        if(leasePrice != 0){
            System.out.println("You can lease a " + carMake + " " + carModel + " for $" + leasePrice);
        }

    }
}
