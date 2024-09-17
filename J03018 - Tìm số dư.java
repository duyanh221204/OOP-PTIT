import java.util.*;
import java.math.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            BigInteger n = sc.nextBigInteger();
            if (n.equals(new BigInteger("0"))) System.out.println ("4");
            else
            {
                int d = 1;
                if (n.remainder(new BigInteger("2")).equals(new BigInteger("0"))) d += 6;
                else d += 4;
                BigInteger mod = n.remainder(new BigInteger("4"));
                if (mod.equals(new BigInteger("1"))) d += 5;
                else if (mod.equals(new BigInteger("2"))) d += 13;
                else if (mod.equals(new BigInteger("3"))) d += 15;
                else d += 7;
                System.out.println (d % 5);
            }
        }
    }
}
