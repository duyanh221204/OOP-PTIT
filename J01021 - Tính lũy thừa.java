import java.util.*;
public class Main
{
    static long mod = (long)1e9 + 7;
    public static long tt(long a, long b)
    {
        if (b == 0) return 1;
        long s = tt(a, b >> 1) % mod;
        s = (s * s) % mod;
        if (b % 2 == 1) s = (s * a) % mod;
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            long a = sc.nextLong(), b = sc.nextLong();
            if (a == 0 && b == 0) break;
            System.out.println (tt(a, b));
        }
    }
}
