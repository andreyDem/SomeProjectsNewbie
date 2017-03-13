package hackerrank.testSomeIdeas;


import java.util.HashMap;
import java.util.Map;

public class Test5Map<T> {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("key", "value");
        map.put("key1", "value");
        System.out.println(map.size());
    }
}