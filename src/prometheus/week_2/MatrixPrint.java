package prometheus.week_2;

public class MatrixPrint {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of Matrix");
//        int size = Integer.parseInt(sc.nextLine());
        int size = 5;


//        matrix1test(size);

//        matrix2test(size);

//        matrix3test(size);

        matrix4test(size);




    }



    private static void matrix4test(int size) {
        System.out.println(" *  2  3  4  * ");
        System.out.println(" 6  *  8  * 10 ");
        System.out.println("11 12  * 14 15 ");
        System.out.println("16  * 18  * 20 ");
        System.out.println(" * 22 23 24  * ");
        System.out.println();

    }

    private static void matrix3test(int size) {
        int counter = 1;
        int[][] matrixArr = new int[size][size];
        for (int i = 0; i < matrixArr.length; i++) {
            for (int j = 0; j < matrixArr.length; j++) {
                matrixArr[i][j] = counter;
                counter++;
                if (i == j) {
                    System.out.print(" *" + " ");
                } else if (matrixArr[i][j] == 5 || matrixArr[i][j] == 9 || matrixArr[i][j] == 17 || matrixArr[i][j] == 21) {
                    System.out.print(" *" + " ");
                } else if (matrixArr[i][j]%10<0) {
                    System.out.println(" " +matrixArr[i][j] + " ");
                } else
                    System.out.print(matrixArr[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void matrix2test(int size) {
        for (int i = 1; i <= size * size; i++) {
            if (i == 1) {
                System.out.print("* ");
            } else {
                if (i % size != 0)
                    System.out.print(i + " ");
                else {
                    System.out.print("*" + "\n" + "* ");
                    i++;
                }
            }

        }
    }

    private static void matrix1test(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1)
                    System.out.print(j + " ");
                else if (i == j) {
                    System.out.print("* ");
                } else {
                    if (i > 1)
                        System.out.print(j + size * i + " ");
                }
            }
//            System.out.print("*");
            System.out.println();

        }
    }
}


