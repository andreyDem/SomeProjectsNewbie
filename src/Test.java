import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        balance(balances, ownerNames);

    }

    public static void balance(int[] balances, String[] ownerNames) {
        double commision = 0.05;
        double b;
        double calculation;

        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter name:");
        String name = in.next();
        System.out.println("Please, enter withdrawal amount:");
        String withdrawal = in.next();

        int result = Integer.parseInt(withdrawal);
        int counter = 0;
        for (int i = 0; i < ownerNames.length; i++) {
            if (name.equals(ownerNames[i])) {
                for (int j = i; j < balances.length; j++) {
                    b = balances[j];
                    if ((calculation = b - result - (result * commision)) >= 0) {
                        System.out.println("Owner name: " + ownerNames[i] + ";\n Withdrawal: " + withdrawal + "; " +
                                "\n Balance: " + calculation + ";");
                        break;
                    } else {
                        System.out.println("Operation denied!");
                        break;
                    }
                }
                break;
                } else counter++;



        }
        if (counter>0)
            System.out.println("Xren'");
    }
}
