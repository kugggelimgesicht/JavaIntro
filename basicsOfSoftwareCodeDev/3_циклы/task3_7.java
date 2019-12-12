//для каждого натурального числа в промежутке от m до n вывести все делители, кроме самого числа и единицы
import java.util.Scanner;
public class task3_7 {
         public static void div(int a) {
             for (int i = 2; i < a; i++)
                 if(a % i == 0)
                     System.out.print(i+", ");
                 else
                     System.out.print("");
         }

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите m: ");
            int m = in.nextInt();
            System.out.println("Введите n: ");
            int n = in.nextInt();

            if (n < m)
                System.out.println("Неверный ввод");
            else
                for (int i = m; i <= n; i++){
                    System.out.print("делители числа "+i+": ");
                    div(i);
                    System.out.println("");
                }
        }
    }
