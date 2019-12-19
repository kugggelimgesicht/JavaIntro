//сумма чисел, порядковые номера которых являются простыми числами
import java.util.Scanner;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;
public class a6 {
    public static void main(String[] args) {
        int i;
        int j;
        final int n;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива:");
        n = in.nextInt();
        int A [] = new int [n];
        for (i = 0; i < n; i++) {
            System.out.print("Введите " + i +"й"+ " элемент массива:");
            A [i] = in.nextInt();
            if (i >= 2){
                for (j = 2; j <= i; j++){
                    if (i % j == 0 && i == j)
                        sum += A[i];
                     else if (i % j == 0 && i != j)
                        break;
                     else
                        continue;
                            }
                         }
                    }
        System.out.print(sum);
    }
}