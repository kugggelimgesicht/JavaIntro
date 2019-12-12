//Найти max{min(a, b), min(c, d)}
import java.util.Scanner;
public class task2_2 {

            public static int min(int a, int b){
        if(a<b)
            return a;
        else
            return b;
    }
    public static int max(int a, int b, int c, int d){
        if(min(a,b)>min(c,d))
            return min(a,b);
        else
            return min(c,d);
    }

    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Введите а: ");
    int a = in.nextInt();
    System.out.println("Введите b: ");
    int b = in.nextInt();
    System.out.println("Введите c: ");
    int c = in.nextInt();
    System.out.println("Введите d: ");
    int d = in.nextInt();
    System.out.println(max(a, b, c, d));
    }}
