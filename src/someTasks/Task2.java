package someTasks;

//Напишите метод, который будет увеличивать заданный элемент массива на 10%.

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(increaseOne(arr , 5)));
    }

    private static double[] increaseOne(int[] arr, int a) {
        double[] arr2 = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == a){
                arr2[i] = arr[i] * 1.1;
            }else
            arr2[i] = arr[i];

        }
        return arr2;
    }

}
