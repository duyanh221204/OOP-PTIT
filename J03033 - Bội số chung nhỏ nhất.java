import java.util.*;
import java.math.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String a = sc.nextLine(), b = sc.nextLine();
            BigInteger c = new BigInteger(a), d = new BigInteger(b);
            BigInteger x = new BigInteger(String.valueOf(c.gcd(d)));
            System.out.println (c.multiply(d).divide(x));
        }
    }
}
