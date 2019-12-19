//диагональ квадратной матрицы
import java.lang.*;
import java.util.Scanner;
public class a_2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Количество строк и столбцов: ");
        int x = in.nextInt();
        int y = x;
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
                if(j!=i)
                    continue;
                else

                    System.out.print( a[i][j] + " ");

            }
        }
    }
}
