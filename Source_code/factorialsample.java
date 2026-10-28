
import java.math.BigInteger;

public class factorialsample 
{
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]); 
        BigInteger fact = BigInteger.ONE;  

        for (int i = 1; i<= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i)); 
        }

        System.out.println("Factorial is = " + fact); 
    }
}
  