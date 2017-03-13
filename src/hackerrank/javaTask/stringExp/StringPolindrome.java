package hackerrank.javaTask.stringExp;

import java.util.Scanner;

public class StringPolindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            B = B + A.charAt(i);
        }

        if (B.equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
