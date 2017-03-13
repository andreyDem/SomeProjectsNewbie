package hackerrank.testSomeIdeas.test3Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> hashMap = new HashMap<>();

        hashMap.put("Кот", new Cat("Мурзик", 3));
        hashMap.put("Собака", new Dog("Бобик", 5));
        hashMap.put("Попугай", new Parrot("Кеша", 7));
        System.out.println(hashMap);
        Pet cat = hashMap.get("Кот");
        System.out.println(cat);
        System.out.println(hashMap.containsKey("Кот"));
        System.out.println(hashMap.containsValue(cat));
    }
}
