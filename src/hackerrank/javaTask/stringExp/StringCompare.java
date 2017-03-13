package hackerrank.javaTask.stringExp;

import java.util.Arrays;
import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();     //welcometojava
        int k = sc.nextInt();           //3


        String strArr = "";
        for (int i = 0; i <str.length()-k+1 ; i++) {
            strArr = strArr + str.substring(i, i+k) + " ";
        }

//        System.out.println(strArr);

        String[] newStr = strArr.split(" ");
//        System.out.println(Arrays.toString(newStr));


        Arrays.sort(newStr);
//        System.out.println(Arrays.toString(newStr));
        System.out.println(newStr[0]);
        System.out.println(newStr[newStr.length-1]);
    }
}
