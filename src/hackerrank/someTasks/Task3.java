package hackerrank.someTasks;

import java.util.Scanner;

//. Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой».

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(replaceB9ka(scanner.nextLine()));

    }

    private static String replaceB9ka(String line) {
        String newLine = line.replaceAll("бяка", "вырезано цензурой");
        return newLine;
    }
}
