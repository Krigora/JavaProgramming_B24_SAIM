package office_hours.practice_11_24_2021;

public class Example {

    public static void main(String[] args) throws InterruptedException{

        Thread.sleep(2000);

        try {
            String s = "java";
            s.charAt(1000);
            int [] a = {3,2,5,1,5};
            System.out.println(a[100]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String exception caught");
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e){
            System.out.println("Parent catches");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }



    }

    /*

        Checked: child of Exception class

            must be handled during compiling, before the program can run

        Unchecked: child of RuntimeException class

            does not need to be handled during compiling, but can be
            normally occur during exception, and usually because of logical or technical issue

        How do you handle exceptions?

            try catch block

            -> throws will allow you to compile and accepts that if an Exception happen it should be thrown

     */

}
