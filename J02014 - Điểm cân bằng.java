import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[n + 2], b = new int[n + 2];
            for (int i = 1; i <= n; ++i)
            {
                a[i] = sc.nextInt();
                b[i] = b[i - 1] + a[i];
            }
            if (n < 3) System.out.println ("-1");
            else
            {
                int d = 0;
                for (int i = 2; i < n; ++i)
                {
                    if (b[i - 1] == b[n] - b[i])
                    {
                        d = 1;
                        System.out.println (i);
                        break;
                    }
                }
                if (d == 0) System.out.println ("-1");
            }
        }
    }
}
