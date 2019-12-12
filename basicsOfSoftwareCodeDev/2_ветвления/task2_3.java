//лежат ли три точки на одной прямой
import java.util.Scanner;
public class task2_3 {
    public static boolean line( int x_1, int y_1, int x_2, int y_2, int x_3, int y_3){
    if ((x_3 - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1)){
	System.out.println("данные точки лежат на одной прямой.");
        return true;}
    else{
	System.out.println("данные точки не лежат на одной прямой.");
        return false;}
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x1: ");
        int a = in.nextInt();
        System.out.println("Введите y1: ");
        int b = in.nextInt();
        System.out.println("Введите x2: ");
        int c = in.nextInt();
        System.out.println("Введите y2: ");
        int d = in.nextInt();
        System.out.println("Введите x3: ");
        int e = in.nextInt();
        System.out.println("Введите y3: ");
        int f = in.nextInt();
       line(a, b, c, d, e, f);

    }}