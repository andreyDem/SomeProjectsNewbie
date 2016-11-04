package algorithms;

import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int[] arrA = {a0, a1, a2};
        int[] arrB = {b0, b1, b2};

        int scoreA = 0;
        int scoreB = 0;
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] > arrB[i])
                scoreA++;
            else if (arrB[i] > arrA[i])
                scoreB++;
        }
        System.out.println(scoreA + " " + scoreB);
    }
}
