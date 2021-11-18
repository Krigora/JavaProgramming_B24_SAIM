package day59_exceptions;

public class MultiCatch {

    public static void main(String[] args) {

        try {
            System.out.println(10/0);

            Thread.sleep(-10);

        } catch (ArithmeticException e) {
            System.out.println("Handled in Arithmetic block");
        } catch (RuntimeException e){
            System.out.println("Handled in runtime block");
        } catch (Exception e){
            System.out.println("Handled generally");
        }

        /*

        ArithmeticException obj = new ArithmeticException();

        RunTimeException obj = new ArithmeticException();

        Exception obj = new ArithmeticException();

         */

    }

}
