//поменять местами наибольший и наименьший элементы
import java.util.Arrays;
import java.util.Scanner;
public class a4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = in.nextInt();
        int[] a = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexMin = 0;
        int indexMax = 0;
        int temp = 0;

        for (int i = 0; i < n; i++){
            System.out.println("Введите "+i+"й элемент массива: ");
            a[i] = in.nextInt();
            if (a[i] < min) {
                min = a[i];
                indexMin = i; }
            else if (a[i] > max) {
                max = a[i];
                indexMax = i; }
        }
        System.out.println("исходный массив: "+ Arrays.toString(a));

        temp = a[indexMax];
        a[indexMax] = a[indexMin];
        a[indexMin] = temp;

    System.out.println("полученный массив: "+ Arrays.toString(a));
    }
}