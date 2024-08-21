import java.math.BigInteger;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String x = sc.next(), y = sc.next();
            BigInteger a = new BigInteger(x), b = new BigInteger(y);
            System.out.println (a.add(b));
        }
    }
}
