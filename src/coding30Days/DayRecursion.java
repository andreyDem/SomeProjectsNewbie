package coding30Days;

import java.util.Scanner;

public class DayRecursion {
    public static void main(String[] args) {
        //factorial
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            N = sc.nextInt();
        } while (N > 12 && N < 2);

        System.out.println(factorial(N));
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
