package hackerrank.someTasks;

//Найдите среднее арифметическое массива из 10 элементов типа double.

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        double[] arr = new double[10];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10) * 1.1;
            sum = sum + arr[i];
        }
        double average = sum/arr.length;
        System.out.println(average);
    }
}
