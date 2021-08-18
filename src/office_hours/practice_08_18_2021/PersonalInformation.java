package office_hours.practice_08_18_2021;

import java.util.Scanner;

public class PersonalInformation {

    /*
    [Personal Information - Scanner and If]
        Ask the user how many people they live with?
        if user lives with Less than 2 people: print "Live with less than 2 people"
        if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
        if the user lives with more than 6 people: print "Live with "more than 6 people"
        Ask the user what city they live in?
        Ask the user if the live in downtown ("yes or no")
        if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
        if they have thought about it print "do it its great", if they have not print "You should think about it"
        Ask the user their favorite animal?
        Print "Wow %animal is a great animal"
        Ask the user how many pets they want?
        Print "Interesting, do you want %numberOfPets %favoriteAnimals?"
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, how many people do you live with?");
        int liveWithNumber = input.nextInt();

        if(liveWithNumber <= 2 && liveWithNumber >= 0) {
            System.out.println("Live with less than 2 people");
        } else if(liveWithNumber >= 3  && liveWithNumber <= 6 ){
            System.out.println("Live with 3 - 6 people");
        } else if(liveWithNumber > 6) {
            System.out.println("Live with more than 6 people");
        } else {
            System.out.println("Invalid number of people");
        }

        input.nextLine(); // catches the enter input

        System.out.println("Which city do you live in?");
        String cityName = input.nextLine();

        System.out.println("Do you live downtown?");
        String liveDowntown = input.next();

        if(liveDowntown.equalsIgnoreCase("yes")){
            System.out.println("Have you thought about moving to the suburbs?");
            String moveToSuburb = input.next();

                if(moveToSuburb.equalsIgnoreCase("yes")){
                    System.out.println("Do it, it's great");
                } else if(moveToSuburb.equalsIgnoreCase("no")){
                    System.out.println("You should think about it");
                }

            System.out.println( moveToSuburb.equalsIgnoreCase("yes")
                    ? "Do it, it's great" : "You should think about it" );

        }

        input.nextLine();

        System.out.println("What is your favorite animal");
        String animal = input.nextLine();

        System.out.println("Wow " + animal + " is a cool animal");

        System.out.println("How many pets do you want?");
        int numberOfPets = input.nextInt();

        System.out.println("Interesting, do you want " + numberOfPets + " " + animal);

    }

}
