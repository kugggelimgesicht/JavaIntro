//Дан  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов  ряда,  модуль  которых  больше  или  равен заданному е
import java.util.Scanner;
public class task3_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        double n = in.nextDouble();
        System.out.println("Enter e: ");
        double e = in.nextDouble();
        double sum = 0;

        for (int i = 1; i <= n; i++ ) {
            double a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            if (Math.abs(a) >= e)
                sum = sum + a;
        }
        System.out.println(sum);
    }
}