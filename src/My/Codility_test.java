package My;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Codility_test {

    public static void main(String[] args) {
        String s = "lexicon";

        System.out.println(solution(s));
    }

    static String solution(String s){
        String[] arr = s.toLowerCase().replaceAll("[^aeiou]", "").split("");

        StringBuilder result = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        int max=0;
        for (String each : arr) {
            int freq = Collections.frequency(Arrays.asList(arr), each);
            if (freq>max) max=freq;
            map.put(each, freq);
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue()==max) result.append(e.getKey()).append(" appears ").append(e.getValue()).append(" times\n");
        }
        return result.toString();

    }


}
