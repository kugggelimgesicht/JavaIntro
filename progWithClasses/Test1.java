//методы вывода, изменения, сложения и нахождения большей из переменных
import java.util.Scanner;
import java.lang.*;
    public class Test1{
    static int a = 10;
       static int b = 20;


        public static void printVars(int x, int y){
        System.out.println(x+", "+y);
        }
        public static int changeVar(int x){
        Scanner in = new Scanner(System.in);
        System.out.print("новое значение переменной: ");
        x = in.nextInt();
        return x;
    }
    public static int sum(int x, int y){
     int sum = x+y;
     return sum;
    }
    public static int max(int x, int y){
        if(x>y)
            return x;
        else
            return y;
    }


    public static void main (String[] args){
        printVars(a, b);
        changeVar(a);
        changeVar(b);
        System.out.println( max(a, b));
        System.out.println(sum(a, b));
        System.out.println(sum(changeVar(a), changeVar(b)));


    }
        }

