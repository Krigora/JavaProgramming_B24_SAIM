package office_hours.practice_11_10_2021;

public abstract class Phone {

    String brand;
    String model;
    double price;
    int size;

    public abstract void calling();
    public abstract void texting();

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: "+ price + ", Size: " + size;
    }
}

/*
Abstract + Interface Practice

Create an abstract class called Phone
    attributes: brand, model, price, size
    abstract methods: calling(), texting()
    instance method: toString()

Create an interface named downloadable:
    abstract method: download()

Create an interface named AndroidApps that can inherit from downloadable
    interface variable: AppStoreName
    abstract method(): insertMemoryCard();

Create an interface named AppleApps that can inherit from downloadable
    Interface variable: AppStoreName
    abstract method(): facetime();

Create a class named iPhone that will be the sub class of Phone. Also implement the AppleApps interface
    implement all abstract methods

Create a class named Samsung that will be the sub class of Phone. Also implement the AndroidApps interface
    implement all abstract methods

    Create constructors in each sub class that can initialize the instance variables
 */
