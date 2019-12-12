//Определить цифры, входящие в запись обоих чисел
import java.util.Scanner;
public class task3_8 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int m = in.nextInt();
        System.out.print("Enter second number: ");
        int n = in.nextInt();
        int n1 = n;
        int temp_m = 0;
        int temp_n = 0;
        while (m != 0) {
            temp_m = m % 10;
            while (n1 != 0) {
                temp_n = n1 % 10;
                if (temp_m == temp_n)
                    System.out.print(temp_m + " ");
                n1 /= 10;
            }
            n1 = n;
            m /= 10;
        }
        System.out.println();
    }
}