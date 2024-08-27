import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] f = new long[93];
        f[1] = f[2] = 1;
        for (int i = 3; i < 93; ++i) f[i] = f[i - 2] + f[i - 1];
        while (t-- > 0)
        {
            long n = sc.nextLong(), d = 0;
            for (int i = 0; i < 93; ++i)
            {
                if (n == f[i])
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
