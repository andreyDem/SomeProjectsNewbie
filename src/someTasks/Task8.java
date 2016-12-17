package someTasks;

//4. Создайте метод, который будет считать сколько денег получает работник в неделю.
// Метод должен принимать на входе два аргумента (зарплата в час, кол-во проработанных часов).
//        Условия:
//        1) Каждый час после 40 считается за полтора.
//        2) Работник не может работать больше, чем 60 часов в неделю.
//        3) Работник не может получать меньше 8 долларов в час.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salaryInHour;
        do {
            System.out.println("Enter your salary in hour");
            salaryInHour = scanner.nextInt();
            if (salaryInHour<8)
                System.out.println("Salary can't be smaller than 8");
        } while (salaryInHour < 8);
        int workedHours;
        do {
            System.out.println("Enter your worked hours");
            workedHours = scanner.nextInt();
            if (workedHours>60 || workedHours<0)
                System.out.println("Worked hours can't be bigger than 60 and smaller then 0");
        } while (workedHours > 60 || workedHours < 0);
        workerSalary(salaryInHour, workedHours);
    }

    private static void workerSalary(int salaryInHour, int workedHours) {
        if (workedHours>40){
            double salary = 40 * salaryInHour + (workedHours-40)*1.5 * salaryInHour;
            System.out.println("Worker salary is: " + salary);
        }else{
            double salary = workedHours * salaryInHour;
            System.out.println("Worker salary is: " + salary);
        }

    }


}


