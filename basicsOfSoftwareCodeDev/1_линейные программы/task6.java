//принадлежность точки закрашенной области
import java.util.Scanner;
public class task6 {
    public static void main(String[] args0){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = in.nextInt();
        System.out.print("Enter y: ");
        int y = in.nextInt();
        if((y==-1)&&(x==0))
            System.out.println("точка не принадлежит закрашенной области");
        else if ((y>=0)&&(y<=4)&&(x>=-2)&&(x<=2))
            System.out.println("точка принадлежит закрашенной области");
        else if ((y<=0)&&(y>=-3)&&(x>=-4)&&(x<=4))
            System.out.println("точка принадлежит закрашенной области");
        else
            System.out.println("точка не принадлежит закрашенной области");



    }}
