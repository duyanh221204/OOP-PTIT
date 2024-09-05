import java.util.*;
public class Main
{
    public static int[] a = new int[12], k = new int[12];
    public static void tt(int x, int n)
    {
        for (int i = 1; i <= n; ++i)
        {
            if (k[i] == 0)
            {
                k[i] = 1;
                a[x] = i;
                if (x == n)
                {
                    int d = 0;
                    for (int j = 2; j <= x; ++j)
                    {
                        if (Math.abs(a[j] - a[j - 1]) == 1)
                        {
                            d = 1;
                            break;
                        }
                    }
                    if (d == 0)
                    {
                        for (int j = 1; j <= x; ++j) System.out.print (a[j]);
                        System.out.println ();
                    }
                }
                else tt(x + 1, n);
                k[i] = 0;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int n = sc.nextInt();
            for (int i = 1; i <= n; ++i) a[i] = k[i] = 0;
            tt(1, n);
        }
    }
}
