package day58_exceptions.animal;

public class Panda extends Animal{

    @Override
    public Panda getAnimal(){
        return new Panda();
    }

}
