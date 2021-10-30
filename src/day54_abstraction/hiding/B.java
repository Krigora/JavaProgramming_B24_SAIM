package day54_abstraction.hiding;

public class B extends A {

    public static void staticMethod(){
        System.out.println("B");
    }

    public void instanceMethodB(){
        staticMethod();
    }

}
