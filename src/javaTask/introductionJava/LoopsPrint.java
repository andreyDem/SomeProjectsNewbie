package javaTask.introductionJava;

import java.util.Scanner;

public class LoopsPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        do {
            N = sc.nextInt();
        } while (N < 2 && N > 20);
        for (int i = 1; i <= 10; i++) {
            int result = i * N;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}
