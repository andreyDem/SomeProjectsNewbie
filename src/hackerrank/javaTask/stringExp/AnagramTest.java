package hackerrank.javaTask.stringExp;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        char[] chars1 = a.toLowerCase().toCharArray();
        char[] chars2 = b.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}
