package day55_abstraction.learn_Interface;

public interface First {

    public abstract void write(); // public abstract part is grey, because you don't need it, all methods are public abstract by default

    void read();

}

class Book implements First{

    @Override
    public void write() {

    }

    @Override
    public void read() {

    }

}



