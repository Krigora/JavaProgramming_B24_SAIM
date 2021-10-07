package office_hours.practice_10_07_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LameDB {

    public static String lameDb(String db, String op, String id, String data) {

       // lameDb("1etsy#2wooden#3spoon","add","4","aaa")

        ArrayList<String> list = new ArrayList<>(Arrays.asList(db.split("#")));

        // takes the db String and converts it to a String array that is used in the Array.asList method to give us ArrayList

        // "1etsy#2wooden#3spoon" -> [ 1etsy, 2wooden, 3spoon ]

        int idNum = Integer.parseInt(id); // converts the id String to a int type

        switch (op){

            case "add":
            case "edit":
                list.set(idNum - 1, id + data);
            case "delete":
                list.remove(idNum - 1);
        }

        // the idNum - 1 is how we convert the id number from the method params, to the index number we can use with ArrayList

        /*

        m.lameDb("1test#2bla#3foo","edit","2","bbb")

        returns:  1test#2bbb#3foo


        m.lameDb("1tst#2bla#3foo","delete",1","")

            returns:  #2bla#3foo
         */






        return null;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }
}
