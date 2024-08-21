import java.util.*;
public class Main
{
    public static long gcd(long a, long b)
    {
        while (b > 0)
        {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 1; tc <= t; ++tc)
        {
            long a = sc.nextLong(), b = sc.nextLong();
            System.out.printf ("%d %d\n", a / gcd(a, b) * b, gcd(a, b));
        }
    }
}
