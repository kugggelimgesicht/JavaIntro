//заменить все числа последовательности, больше даннного Z, этим числом и посчитать число замен
import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        int n;
        int z;
        int sum = 0;
        int zam = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива:");
        n = in.nextInt();
        int []  A = new int [n];
        System.out.print("Элементы массива не должны быть больше числа:");
        z = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + i +"й"+ " элемент массива:");
            A [i] = in.nextInt();
            if (A[i] > z ) {
                sum = sum + z;
                zam = sum/z;
            }
        }
        System.out.print("Произведено замен: " + zam);
    }
}

