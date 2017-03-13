package hackerrank.coding30Days;

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {
//        Day 6: Let's Review
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        String str[] = new String[T];
        int i = 0;
        do {
            str[i] = scanner.nextLine();
            i++;
        } while (i < T);


        for (String s : str) {
            stringMix(s);
        }
    }

    public static void stringMix(String string){
        char[] chars = string.toCharArray();
        String s1 ="";
        String s2 ="";
        for (int i = 0; i < chars.length; i++) {
            if (i%2==0)
                s1 = s1 + chars[i];
            else
                s2 = s2 + chars[i];
        }
        System.out.println(s1 + " " + s2);
    }

}
