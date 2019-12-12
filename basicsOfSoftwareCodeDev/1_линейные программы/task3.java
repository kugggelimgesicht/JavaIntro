//вычислить значение выражения по формуле
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input X: ");
        double X = in.nextDouble();
        System.out.println("Input Y: ");
        double Y = in.nextDouble();
        double k = ((Math.sin(X) + Math.cos(Y)) / (Math.cos(X) - Math.sin(Y))) * Math.tan(X*Y);
        System.out.println(k); }
}
