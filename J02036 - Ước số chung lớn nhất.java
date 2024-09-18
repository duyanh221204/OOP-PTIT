import java.util.*;
public class Main
{
    public static int gcd(int a, int b)
    {
        while (b > 0)
        {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n + 2];
            for (int i = 1; i <= n; ++i) a[i] = sc.nextInt();
            long[] b = new long[n + 2];
            b[1] = a[1];
            for (int i = 2; i <= n; ++i) b[i] = (long)a[i] / gcd(a[i], a[i - 1]) * a[i - 1];
            b[n + 1] = a[n];
            for (int i = 1; i <= n + 1; ++i) System.out.print (b[i] + " ");
            System.out.println ();
        }
    }
}
