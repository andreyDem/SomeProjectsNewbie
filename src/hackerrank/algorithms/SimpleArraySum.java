package hackerrank.algorithms;


import java.util.Scanner;

public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        int i = 0;
        while (N!=0){
            arr[i] = scanner.nextInt();
            N--;
            i++;
        }
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        System.out.println(sum);
        //System.out.println(Arrays.toString(arr));
    }
}
