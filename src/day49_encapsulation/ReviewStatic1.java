package day49_encapsulation;

public class ReviewStatic1 {

    static int i = 6;
    int a = 4;

    public static void main(String[] args) {
        System.out.println("A");
        new ReviewStatic1();
        method1();
    }

    public ReviewStatic1(){
        System.out.println("B");
    }

    static {
        System.out.println("C");
       // System.out.println(a);
    }

    public static void method1(){
        System.out.println("D");
        System.out.println(i);
       // System.out.println(a);
    }
    public void method2(){
        System.out.println(i);
    }

}
