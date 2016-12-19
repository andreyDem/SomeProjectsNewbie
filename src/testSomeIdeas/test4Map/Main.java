package testSomeIdeas.test4Map;

import testSomeIdeas.test3Map.Cat;
import testSomeIdeas.test3Map.Dog;
import testSomeIdeas.test3Map.Parrot;
import testSomeIdeas.test3Map.Pet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> personMap = new HashMap<>();

        personMap.put(new Person("Иван"), Arrays.asList(new Cat("Барсик", 3), new Cat("Мурзик", 4)));
        personMap.put(new Person("Маша"), Arrays.asList(new Cat("Васька", 5), new Dog("Бобик", 8)));
        personMap.put(new Person("Ирина"), Arrays.asList(new Cat("Рыжик", 7), new Dog("Шарик", 10), new Parrot("Гоша", 1)));

        System.out.println("personMap: " + personMap);
        System.out.println("personMap.keySet(): " + personMap.keySet());

        for(Person person : personMap.keySet()){
            System.out.println(person + " имеет");
            for (Pet pet : personMap.get(person)){
                System.out.println("  " + pet);
            }
        }
    }
}
