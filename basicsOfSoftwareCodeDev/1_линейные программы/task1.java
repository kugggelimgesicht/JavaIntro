//найдите значение функции z: = ((a - 3)* b / 2) + c.
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a: ");
        double a = in.nextDouble();
        System.out.println("enter b: ");
        double b = in.nextDouble();
        System.out.println("enter c: ");
        double c = in.nextDouble();
        double z = ((a - 3) * b / 2) + c;
        System.out.println(z);
        in.close();

    }
}
