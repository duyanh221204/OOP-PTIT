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
            String s = sc.nextLine();
            String[] k = s.split("\\s+");
            String a = k[0], b = k[1];
            BigInteger c = new BigInteger(a), d = new BigInteger(b);
            BigInteger x = new BigInteger(String.valueOf(c.mod(d))), y = new BigInteger(String.valueOf(d.mod(c)));
            if (x.equals(new BigInteger("0")) || y.equals(new BigInteger("0"))) System.out.println ("YES");
            else System.out.println ("NO");
        }
    }
}
