import java.math.BigInteger;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0)
        {
            String n = sc.nextLine();
            BigInteger x = new BigInteger(n), y = new BigInteger("11");
            if (x.remainder(y).equals(new BigInteger("0"))) System.out.println ("1");
            else System.out.println ("0");
        }
    }
}
