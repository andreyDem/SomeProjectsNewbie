package hackerrank.javaTask.stringExp;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        char ch1 = A.charAt(0);
        char ch2 = B.charAt(0);
        if (A.compareTo(B)<0)
            System.out.println("No");
        else if (A.compareTo(B)>0)
            System.out.println("Yes");
        else
            System.out.println("No");

        String newS1 = (""+ch1).toUpperCase() + A.substring(1);
        String newS2 = (""+ch2).toUpperCase() + B.substring(1);
        System.out.println(newS1 + " " + newS2);
    }
}
