//сумма элементов массива А[N], кратных k
import java.util.Scanner;
public class a1 {
    public static void main(String[] args) {
        int n;
        int k;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        n = in.nextInt();
        int A [] = new int [n];
        System.out.print("Элементы массива должны быть кратны числу: ");
        k = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + i +"й"+ " элемент массива: ");
            A [i] = in.nextInt();
            if (A[i] % k == 0) {
                sum = sum + A [i];
            }
        }
        System.out.print("Сума элементов массива кратных числу " + k + ": " + sum);
    }
}