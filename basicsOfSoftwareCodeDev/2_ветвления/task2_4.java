//Проходит ли кирпич X:Y:Z через отверстие A:B
import java.util.Scanner;
public class task2_4 {
    public static void brick(int a, int b, int x, int y, int z){
        if(a>x&&b>y || a>y&&b>x)
            System.out.println("Проходит!");
        else if (a>x&&b>z || a>z&&b>x)
            System.out.println("Проходит!");
        else if (a>z&&b>y || a>y&&b>z)
            System.out.println("Проходит!");
        else
            System.out.println("Не проходит!");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите A: ");
        int a = in.nextInt();
        System.out.println("Введите B: ");
        int b = in.nextInt();
        System.out.println("Введите X: ");
        int x = in.nextInt();
        System.out.println("Введите Y: ");
        int y = in.nextInt();
        System.out.println("Введите Z: ");
        int z = in.nextInt();
        brick(a,b,x,y,z);


    }}