//вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
import java.lang.*;
import java.util.Scanner;
public class a_1 {
        public static void main (String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Количество строк: ");
            int x = in.nextInt();
            System.out.print("Количество столбцов: ");
            int y = in.nextInt();
            int[][] a = new int[x][y];

            for (int i = 0; i < x; i++) {

                for (int j = 0; j < y; j++) {
                    a [i][j] = (int) (Math.random()*100);
                    System.out.print(" " + a [i][j]);
                }

               System.out.println();
            }
            System.out.println();

            for (int i = 0; i < x; i ++) {
                for (int j = 0; j < y; j++){

                if(j%2!=0) // так как нумерация столбцов начинается с нуля, нечетными будут столбцы, индексированные четными числами
                    continue;
                if (a[0][j] > a[y-1][j]) {

                        System.out.print( a[i][j] + " ");
                    }
                }

                System.out.println();
            }
        }
}
