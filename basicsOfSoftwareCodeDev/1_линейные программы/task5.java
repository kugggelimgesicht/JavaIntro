//вывести значение длительности секунд в формате ЧЧ:ММ:СС
import java.time.*;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Seconds: ");
        int a = in.nextInt();
        System.out.println(LocalTime.ofSecondOfDay(a));
    }
}
