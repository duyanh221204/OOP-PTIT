import java.util.*;
import java.math.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String a = sc.next(), b = sc.next();
            BigInteger c = new BigInteger(a), d = new BigInteger(b);
            BigInteger x = new BigInteger(String.valueOf(c.subtract(d)));
            x = x.abs();
            String s1 = x.toString();
            int len = Math.max(c.toString().length(), d.toString().length());
            while (s1.length() < len) s1 = "0" + s1;
            System.out.println (s1);
        }
    }
}
