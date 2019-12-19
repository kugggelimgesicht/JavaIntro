//вывести k-ю строку и p-й столбец
import java.lang.*;
import java.util.Scanner;
public class a_3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int x = in.nextInt();
        System.out.print("Количество столбцов: ");
        int y = in.nextInt();
        int[][] a = new int[x][y];
        System.out.print("Вывести строку под номером: ");
        int k = in.nextInt();
        System.out.print("Вывести столбец под номером: ");
        int p = in.nextInt();
        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {
                a [i][j] = (int) (Math.random()*100);
                System.out.print(" " + a [i][j]);
            }

            System.out.println();
        }
        System.out.println("Строка к:");

        for (int i = 0; i < x; i ++) {

            for (int j = 0; j < y; j++){

                if(i==k)
                    System.out.print( a[i][j] + " ");

            }

        }System.out.println();
        System.out.println("Столбец р:");
        for (int i = 0; i < x; i ++) {

            for (int j = 0; j < y; j++){

                if(j==p)
                    System.out.println( a[i][j] +" ");
            }
        }
    }
}