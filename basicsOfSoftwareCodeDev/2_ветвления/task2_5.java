//вычислить значение функции
import java.util.Scanner;
public class task2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double F = 0;
        System.out.println("Введите x: ");
        double x = in.nextDouble();
        if(x<=3)
           F+=(x*x - 3*x +9);
        else
           F+=(1/(x*x*x +6));
        System.out.println(F);

    }
}
