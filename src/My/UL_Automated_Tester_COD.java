package My;

public class UL_Automated_Tester_COD {

    /*
    1.	Create a function ReverseString which takes a string parameter and returns that string in reversed order

Examples
Input	Output
4yHqb	bqHy4
What shall we do 	od ew llahs tahW

     */

         public static void main(String[] args){
            String s1 = "What shall we do";
            for(int i=s1.length()-1;i>=0;i--)
            {
                System.out.print(s1.charAt(i));
            }
        }


    }


