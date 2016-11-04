package javaTask.stringExp;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        char[] chars = s.toCharArray();
        String newString = "";

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\'' || chars[i] == '_')
                newString = newString + " ";
            else if (chars[i] == '.' || chars[i] == ',' || chars[i] == '!' || chars[i] == '?'
                    || chars[i] == '@')
                newString = newString + "";
            else
                newString = newString + chars[i];
        }
      //  System.out.println(newString);

        String[] arrStr = newString.split(" ");

        System.out.println(arrStr.length);
        for (String s1 : arrStr) {
            System.out.println(s1);
        }

        scan.close();


//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//
//        String delims = "[ .,?!']+";
//        String[] tokens = s.split(delims);
//        System.out.println(tokens.length);
//        for(String str: tokens){
//            System.out.println(str);
//        }
//
//        scan.close();
    }
}
