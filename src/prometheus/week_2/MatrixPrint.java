package prometheus.week_2;

public class MatrixPrint {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of Matrix");
//        int size = Integer.parseInt(sc.nextLine());
        int size = 5;


        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    if (i == 1)
                        System.out.print(j + " ");
                    else
                        System.out.print(j + size * i + " ");
                }
            }
//            System.out.print("*");
            System.out.println();

        }

    }
}


