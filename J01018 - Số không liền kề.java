import java.util.*;
public class Main
{
    public static int kt(long n)
    {
        long[] a = new long[20];
        int x = 0;
        long s = 0;
        while (n > 0)
        {
            s += (n % 10);
            a[x++] = n % 10;
            n /= 10;
        }
        if (s % 10 > 0) return 0;
        for (int i = 0; i < x - 1; ++i)
        {
            if (Math.abs(a[i] - a[i + 1]) != 2) return 0;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            long n = sc.nextLong();
            if (kt(n) == 1) System.out.println ("YES");
            else System.out.println ("NO");
        }
    }
}
