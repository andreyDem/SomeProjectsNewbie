package hackerrank.someTasks;

//        Создайте простую игру основанную на угадывании букв.
//        Пользователь должен угадать загаданную букву A-Z введя ее в консоль.
//        Если пользователь угадал букву программа выведет «Right» и игра закончится,
//        если нет,то пользователь продолжит вводить буквы.
//        (Опционально)Вывести «You’re too low»-если пользователь ввел букву меньше загаданной,
//        «You’re too high»-если пользователь ввел букву больше загаданной

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char from A-Z");
        char sought = (char)('A' + new Random().nextInt(26));
        while (true){
//            System.out.println(sought);
            boolean ask = false;
            String str = scanner.nextLine();
            if (str.charAt(0)==sought){
                System.out.println("Right");
                ask = true;
            } else if (str.charAt(0)<sought){
                System.out.println("You’re too low");
            }else{
                System.out.println("You’re too high");
            }
            if (ask)
                break;
        }
    }
}
