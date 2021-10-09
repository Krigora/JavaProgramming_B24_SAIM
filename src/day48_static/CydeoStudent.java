package day48_static;

public class CydeoStudent {

    String name;
    int id;
    int groupNumber;

    static int batchNumber;
    static String [] instructors;
    static String schoolName;

    public CydeoStudent(String name, int id, int groupNumber){
        this.name = name;
        this.id = id;
        this.groupNumber = groupNumber;
    }

    static {
        batchNumber = 24;
        instructors = new String[]{"Nadir", "Saim", "Murodil"};
        schoolName = "Cydeo";
    }


}
