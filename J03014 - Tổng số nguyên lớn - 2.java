import java.math.BigInteger;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine(), y = sc.nextLine();
        BigInteger a = new BigInteger(x), b = new BigInteger(y);
        System.out.println (a.add(b));
    }
}
