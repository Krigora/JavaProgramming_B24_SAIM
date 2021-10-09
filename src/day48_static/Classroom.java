package day48_static;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {

        System.out.println("Batch: " + CydeoStudent.batchNumber);

        CydeoStudent studentOne = new CydeoStudent("James Bond", 7, 7);
        System.out.println(studentOne);

        CydeoStudent studentTwo = new CydeoStudent("Sherlock Holmes", 10, 8);
        System.out.println(studentTwo);

        System.out.println(studentOne.name + " and " + studentTwo.name + " have the following instructors: " + Arrays.toString(CydeoStudent.instructors));

    }
}
