import java.util.*;
public class Main
{
    public static long gcd(long a, long b)
    {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long[] f = new long[102];
        f[1] = 1;
        for (int i = 2; i <= 100; ++i) f[i] = f[i - 1] / gcd(f[i - 1], i) * i;
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int n = sc.nextInt();
            System.out.println (f[n]);
        }
    }
}
