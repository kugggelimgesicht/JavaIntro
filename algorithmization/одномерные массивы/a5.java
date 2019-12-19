//Даны целые числа a1 a2, ... аn. Вывести на печать только те числа, для которых выполняется условие аi ≤ i.
import java.util.Scanner;
public class a5 {
    public static void main(String[] args) {
        int n;
        int b;
        String s = " ";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива:");
        n = in.nextInt();
        int [] A = new int [n];
        System.out.print("вывести числа после элемента под номером:");
        b = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + i + "й" + " элемент массива:");
            A[i] = in.nextInt();
            if (i > b){
                s +=A[i] + " ";}
            System.out.print(s);

        }

    }
}