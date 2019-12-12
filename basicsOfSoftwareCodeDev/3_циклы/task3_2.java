//Вычислить значения функции на отрезке [а,b] c шагом h
import java.util.Scanner;
public class task3_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = in.nextDouble();
        System.out.println("Enter b: ");
        double b = in.nextDouble();
        System.out.println("Enter h: ");
        double h = in.nextDouble();
        double y;

        for (double x = a; x <= b; x = x + h ) {
            if (x > 2)
                y = x;
            else
                y = -x;
            System.out.println("x = " + x + "   y = " + y);
        }
    }
}