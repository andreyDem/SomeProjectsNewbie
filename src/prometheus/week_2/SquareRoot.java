package prometheus.week_2;

public class SquareRoot {

    public static void main(String[] args) {
//        double a = 3;
//        double b = 2.5;
//        double c = -0.5;

        double a = 0;
        double b = 0;
        double c = 9999999999L;

        // ax2 + bx + c = 0.     3x2 + 2.5b- 0.5c= 0
        double D = (b * b) - (4 * a * c);
        System.out.println(D);

        if (a == b && b == c && c == 0) {
            System.out.println("x1=");
            System.out.println("x2=");
        } else if (a==0 && b == 0){
            System.out.println("x1=");
            System.out.println("x2=");
        }
        else if (a == 0) {
            double x = -c / b;
            if (x == 0) {
                x = Math.abs(x);
            }
            System.out.println("x1=" + x);
            System.out.println("x2=" + x);
        } else if (D < 0) {
            System.out.println("x1=");
            System.out.println("x2=");
        } else if (D == 0) {
            double x = -(b / (2 * a));
            System.out.println("x1=" + x);
            System.out.println("x2=" + x);
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
    }
}

