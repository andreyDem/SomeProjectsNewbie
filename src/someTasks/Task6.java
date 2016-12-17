package someTasks;
//9. Напишите рекурсивный метод отображающий строку задом на перед.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scanner.nextLine();
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse string: " + reverse);
    }
}
