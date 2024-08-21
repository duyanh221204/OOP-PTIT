import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0)
        {
            long n = sc.nextLong();
            int d = 0, x = 0;
            long[] a = new long[20];
            while (n > 0)
            {
                a[x] = n % 10;
                ++x;
                n /= 10;
            }
            //for (int i = 0; i < x; ++i) System.out.print (a[i] + " ");
            for (int i = 0; i < x - 1; ++i)
            {
                if (Math.abs(a[i] - a[i + 1]) != 1)
                {
                    d = 1;
                    System.out.println ("NO");
                    break;
                }
            }
            if (d == 0) System.out.println ("YES");
        }
    }
}
