package day30_array;

public class FirstAndLastCountry {

    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States", "Russia"};

        for(int i= 0; i < countries.length; i++){
            String each = countries[i].toUpperCase();
            System.out.println("Name of Country: " + each);
            System.out.println("First letter is: " + each.charAt(0));
            System.out.println("Last letter is: " + each.charAt(each.length() - 1));

            System.out.println();
        }

        // for each loop

        for(String each : countries){
            each = each.toUpperCase();
            System.out.println("Name of Country: " + each);
            System.out.println("First letter is: " + each.charAt(0));
            System.out.println("Last letter is: " + each.charAt(each.length() - 1));

            System.out.println();
        }


    }
}
