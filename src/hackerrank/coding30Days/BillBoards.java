package hackerrank.coding30Days;

import java.util.Scanner;

public class BillBoards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int billBoards = sc.nextInt();
        int billBoardStep = sc.nextInt();
        int[] arr = new int[billBoards];
        for (int i = 0; i < billBoards; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        if (billBoardStep != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[0] )
                    sum = sum + 0;
                else
                    sum = sum + arr[i];
            }
        } else
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
        System.out.println(sum);

    }
}
