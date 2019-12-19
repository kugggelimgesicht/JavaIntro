//сформировать квадратную матрицу по образцу
import java.util.Scanner;
import java.lang.*;
public class a_5 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Количество строк и столбцов: ");
        int n = in.nextInt();
        int[][] a = new int[n][n];

        for(int x = 0; x < a.length; x++){
            for(int y = 0; y < a.length-x;y++){
                System.out.print((x+1) + " ");
            }
            for(int zero = a.length-x; zero < a.length; zero++){
                System.out.print(0 + " ");
            }
            System.out.println();
        }

    }
}