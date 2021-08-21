package day19_string;

public class IndexOfExample {
    public static void main(String[] args) {

        // charAt -> takes a number(index) and gives back a char

        // indexOf -> takes a char/String and gives back the position/index/number

        //          0123
        String s = "java";
        System.out.println(s.indexOf('j')); // 0
        System.out.println(s.indexOf('a')); // 1
        System.out.println(s.indexOf('z')); // -1
        System.out.println(s.indexOf('v')); // 2


    }
}
