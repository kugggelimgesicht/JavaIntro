//произведение квадратов первых двухсот чисел
import java.math.BigInteger;
public class task3_4 {
    public static void main(String[] args){
        BigInteger integer = new BigInteger("1");

        for(int i = 1; i<=200; i++){
            integer = integer.multiply(BigInteger.valueOf(i*i));
        System.out.println(integer);
	    }
	}
}
