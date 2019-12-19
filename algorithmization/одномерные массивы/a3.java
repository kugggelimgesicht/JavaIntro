//посчитать количество отрицательных, положительных и нулевых чисел
import java.util.Scanner;
    public class a3 {
        public static void main(String[] args) {
            int n;
            int neg = 0;
            int nul = 0;
            int pos = 0;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите количество элементов массива:");
            n = in.nextInt();
            int [] A = new int [n];

            for (int i = 0; i < n; i++) {
                System.out.print("Введите " + i +"й"+ " элемент массива:");
                A [i] = in.nextInt();
                if (A[i] < 0 ) {
                    neg+=1;

                }
                if(A[i] == 0 ){
                    nul+=1;
                }
                if(A[i] > 0 ){
                    pos+=1;
                }
            }
            System.out.println("Количество отрицательных элементов:" + neg);
            System.out.println("Количество положительных элементов: " + pos);
            System.out.println("Количество нулевых элементов: " + nul);
        }
}

