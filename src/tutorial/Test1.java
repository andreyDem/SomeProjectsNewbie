package tutorial;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else if (n >= 2 && n <= 5 && n % 2 == 0)
            System.out.println("Not Weird");
        else if (n >= 6 && n <= 20 && n % 2 == 0)
            System.out.println("Weird");
        else if (n > 20)
            System.out.println("Not Weird");
        else {
            System.out.println("Not Weird");
            //Complete the code

        }
        System.out.println(ans);

    }
}
