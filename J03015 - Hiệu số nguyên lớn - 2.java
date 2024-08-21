import java.util.*;
import java.math.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine();
        BigInteger c = new BigInteger(a), d = new BigInteger(b);
        System.out.print (c.subtract(d));
    }
}
