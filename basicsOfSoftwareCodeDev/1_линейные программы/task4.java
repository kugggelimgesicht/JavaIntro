//поменять местами дробную и целую части числа вида nnn.ddd
import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input num: ");
        double num = in.nextDouble();
        int res = (int)num;
        double res2 = Math.round((num - res)*1000);
        int res3 = (int)res2;
        String s = res3 + "." + res;
        double R = Double.parseDouble(s);
        System.out.println(R);
        in.close();
    }
}
