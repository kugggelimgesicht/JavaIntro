//сумма чисел от единицы до введенного значения
import java.util.Scanner;
public class task3_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = in.nextInt();
        int sum = 0 ;
        for(int i = 1; i<=a; i++){
            sum+=i;
        }
    System.out.println(sum);}
}
