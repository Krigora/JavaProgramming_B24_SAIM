package day56_polymorphism.animal;

public class Lizard extends Reptile {

    @Override
    public void eat() {
        System.out.println("Lizard is eating -- FROM CHILD");
    }
}
