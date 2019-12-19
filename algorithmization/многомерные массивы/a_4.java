//сформировать квадратную матрицу по образцу
import java.util.Scanner;
import java.lang.*;
public class a_4 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Количество строк и столбцов: ");
        int n = in.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if(i%2==0){
                a [i][j] = j+1;
                System.out.print(" " + a [i][j]);}
                else{
                    a [i][j] = n-j;
                System.out.print(" " + a [i][j]);}
            }

            System.out.println();
        }

    }
}
