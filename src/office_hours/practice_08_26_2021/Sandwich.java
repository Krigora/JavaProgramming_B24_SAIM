package office_hours.practice_08_26_2021;

public class Sandwich {
    public static void main(String[] args) {

        String str = "breadjambread";

        int firstBread = str.indexOf("bread");
        int secondBread = str.lastIndexOf("bread");

        if(firstBread != secondBread){
            System.out.println(str.substring(firstBread + 5, secondBread));
        } else {
            System.out.println("nothing");
        }


        // solution 1
//            int firstBreadEnd = str.indexOf("bread") + 5;
//        int secondBread = str.indexOf("bread", firstBreadEnd);
//
//        if(firstBreadEnd >= 0 && secondBread >= 0){
//            System.out.println(str.substring(firstBreadEnd, secondBread));
//        } else {
//            System.out.println("nothing");
//        }


    }
}
