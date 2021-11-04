package day55_abstraction.learn_Interface;

public class English implements Language{
    @Override
    public void hi() {
        System.out.println("Hello");
    }

    @Override
    public void bye() {
        System.out.println("Good bye");
    }
}
