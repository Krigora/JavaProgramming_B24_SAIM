package day45_constructors;

public class Company {

    public static void main(String[] args) {

        Employee one = new Employee("James Bond", 7, "agent", 1_000_000);
        System.out.println(one);
        one.goToMeeting();

    }
}
