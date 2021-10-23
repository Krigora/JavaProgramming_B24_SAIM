package day52_inheritance.person;

public class Student extends Person{

    String schoolName;

    public void study(){
        System.out.println(name + " is studying at " + schoolName);
    }

}
