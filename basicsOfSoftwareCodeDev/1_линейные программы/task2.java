//Вычислить значение выражения по формуле
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = in.nextDouble();
        System.out.println("Input b: ");
        double b = in.nextDouble();
        System.out.println("Input c: ");
        double c = in.nextDouble();
        double z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))/ 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(z);
        in.close();
    }
}
