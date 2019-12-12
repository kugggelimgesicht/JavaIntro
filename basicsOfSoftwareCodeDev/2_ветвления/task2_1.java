//существует ли треугольник с данными углами, и если да, то будет ли он прямоугольным
import java.util.Scanner;
public class task2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("angle 1: ");
        int a = in.nextInt();
        System.out.println("angle 2: ");
        int b = in.nextInt();

        if(isTriangle(a, b)==true)
            isRight(a, b);

    }

    public static boolean isTriangle(int a, int b) {
        if ((a + b) < 180) {
            System.out.println("Треугольник существует.");
            return true;
        } else {
            System.out.println("Треугольник не существует.");
            return false;
        }

    }

    public static boolean isRight(int a, int b) {
        if(a == 90 ^ b == 90){
            System.out.println("Треугольник прямоугольный.");
            return true;}
        else if ((180 - a - b) == 90) {
            System.out.println("Треугольник прямоугольный.");
            return true;}
         else{
             System.out.println("Треугольник не прямоугольный.");
             return false;
            }

        }
    }







