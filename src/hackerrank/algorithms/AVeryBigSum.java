package hackerrank.algorithms;

import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        long sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i <arr.length ; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        scanner.close();
    }
}
