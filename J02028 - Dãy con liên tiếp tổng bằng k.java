import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt(), d = 0, l = 1, r = 1;
            long k = sc.nextLong();
            long[] f = new long[n + 2];
            for (int i = 1; i <= n; ++i)
            {
                long x = sc.nextLong();
                f[i] = f[i - 1] + x;
            }
            while (l <= r && r <= n)
            {
                while (r <= n && f[r] - f[l - 1] < k) ++r;
                if (l <= r && f[r] - f[l - 1] > k) ++l;
                else if (f[r] - f[l - 1] == k)
                {
                    d = 1;
                    System.out.println ("YES");
                    break;
                }
            }
            if (d == 0) System.out.println ("NO");
        }
    }
}
