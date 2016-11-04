package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
//        System.out.println(Arrays.toString(arr));

        int minus = 0;
        int plus = 0;
        int zero = 0;
        for (int i : arr) {
            if (i < 0)
                minus++;
            else if (i > 0)
                plus++;
            else
                zero++;
        }

        System.out.println((double) plus / N);
        System.out.println((double) minus / N);
        System.out.println((double) zero / N);

    }
}
