package day15_switch;

public class Elevator {

    public static void main(String[] args) {

        int floorNum = 4;

        switch (floorNum){
            case 1:
                System.out.println("Going to floor 1");
                System.out.println("Companies on this floor are: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Going to floor 2");
                System.out.println("Companies on this floor are: Cybertek, Sony, Walmart");
                break;
            case 3:
                System.out.println("Going to floor 3");
                System.out.println("Companies on this floor are: Apple, Walgreens, Jewels");
                break;
            case 4:
                System.out.println("Going to floor 4");
                System.out.println("Companies on this floor are: Uber, Lyft, Costco");
                break;
        }


//        if(floorNum == 1){
//            System.out.println("Going to floor 1");
//            System.out.println("Companies on this floor are: Lobby, Verizon, Starbucks");
//        } else if(floorNum == 2){
//            System.out.println("Going to floor 2");
//            System.out.println("Companies on this floor are: Cybertek, Sony, Walmart");
//        }else if(floorNum == 3){
//            System.out.println("Going to floor 3");
//            System.out.println("Companies on this floor are: Apple, Walgreens, Jewels");
//        } else if(floorNum == 4){
//            System.out.println("Going to floor 4");
//            System.out.println("Companies on this floor are: Uber, Lyft, Costco");
//        }

    }
}
