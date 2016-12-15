package someTasks;

import java.util.Scanner;

//Напишите программу, которая считывает символы пока не встретится точка.
//        Также предусмотрите вывод количества пробелов.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String string = scanner.nextLine();
            int counter = 0;
            boolean isActive = false;
            char[] chars = string.toCharArray();
            for (int i = 0; i <chars.length ; i++) {
                if (chars[i] == ' ')
                    counter++;
                if (chars[i] == '.')
                    isActive = true;
            }
            System.out.println(counter);
            if (isActive)
                break;
        }
    }
}
