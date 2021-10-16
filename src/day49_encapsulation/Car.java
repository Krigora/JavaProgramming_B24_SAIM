package day49_encapsulation;

public class Car {



}


/*
    String driver; // name, licnum, age
    String engine; // cylinder, horesepower
 */

class Driver{

    String name;
    String licenseNumber;
    int age;

    public Driver(String name, String licenseNumber, int age) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
