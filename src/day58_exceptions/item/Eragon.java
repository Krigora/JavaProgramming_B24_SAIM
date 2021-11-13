package day58_exceptions.item;

public class Eragon extends Book{

    public Eragon(){
        super("Eragon");
    }

    @Override
    public void use(){
        System.out.println("Reading Eragon");
    }


}
