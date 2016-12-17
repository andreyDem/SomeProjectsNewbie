package someTasks;
//. Найдите победителя марафона.
//        Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон вы можете увидеть ниже.
//        Ваша задача найти человека, который быстрее всех пробежал дистанцию и вывести его имя и счет.
//        (Опционально) Найдите человека, который прибежал вторым.

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

        int[] times2 = times.clone();
        Arrays.sort(times2);
        for (int i = 0; i < times2.length; i++) {
            if (times2[0] == times[i])
                System.out.println("First is: " + names[i] + " " + times2[0] +"ms");
            if (times2[1] == times[i])
                System.out.println("Second is: " + names[i] + " " + times2[1] +"ms");
            if (times2[2] == times[i])
                System.out.println("Third is: " + names[i] + " " + times2[2] +"ms");
        }

    }
}
